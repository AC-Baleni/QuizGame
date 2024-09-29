package com.balenii.QuizGame.Services;

import com.balenii.QuizGame.Entities.Quiz;
import com.balenii.QuizGame.Repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public List<Quiz> getQuestions(String category) {
        return quizRepository.findAll();
    }

    // Other CRUD operations
}
