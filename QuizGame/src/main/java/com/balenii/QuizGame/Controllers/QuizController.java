package com.balenii.QuizGame.Controllers;

import com.balenii.QuizGame.Entities.Question;
import com.balenii.QuizGame.Entities.Quiz;
import com.balenii.QuizGame.Entities.Score;
import com.balenii.QuizGame.Entities.User;
import com.balenii.QuizGame.Services.QuizService;
import com.balenii.QuizGame.Services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("user")
public class QuizController {

    @Autowired
    private QuizService quizService;
    @Autowired
    ScoreService scoreService;

    @GetMapping("/quiz")
    public String quiz(@ModelAttribute("quiz") Quiz quiz, Model model) {
        // Fetch quiz based on user’s selected category
        List<Quiz> questions = quizService.getQuestions(quiz.getCategory());
        model.addAttribute("questions", questions);
        return "quiz";
    }

    @PostMapping("/submitQuiz")
    public String submitQuiz(@ModelAttribute("user") User user, @ModelAttribute("quiz") Quiz quiz,@ModelAttribute("score") Score score, Model model) {
        // Calculate score
        score.setUserId(user.getUserId());
        score.setQuizId(quiz.getQuizId());
        scoreService.createScore(score);
        model.addAttribute("score", score);
        return "result";
    }
}

