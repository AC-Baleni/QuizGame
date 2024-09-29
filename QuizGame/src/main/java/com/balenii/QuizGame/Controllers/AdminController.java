package com.balenii.QuizGame.Controllers;

import com.balenii.QuizGame.Entities.Admin;
import com.balenii.QuizGame.Entities.Quiz;
import com.balenii.QuizGame.Entities.User;
import com.balenii.QuizGame.Services.QuizService;
import com.balenii.QuizGame.Services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("admin")
public class AdminController {

    UserService userService;
    QuizService quizService;

    @GetMapping("/admin")
    public String adminLogin(Model model) {
        model.addAttribute("admin", new Admin());
        return "admin-login";
    }

    @PostMapping("/adminLogin")
    public String adminLogin(@ModelAttribute("admin") Admin admin, Model model) {
        // Authenticate admin
        return "admin-dashboard";
    }

    @GetMapping("/loadQuizzes")
    public String loadQuizzes(Model model) {
        // Load quizzes form
        return "load-quizzes";
    }

    @PostMapping("/addQuiz")
    public String addQuiz(@ModelAttribute("quiz") Quiz quiz, Model model) {
        // Add quiz to the database
        quizService.createQuiz(quiz);
        return "redirect:/admin-dashboard";
    }

    @GetMapping("/viewPlayers")
    public String viewPlayers(Model model) {

        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "view-players";
    }
}

