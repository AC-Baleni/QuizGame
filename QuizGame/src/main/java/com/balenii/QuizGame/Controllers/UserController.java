package com.balenii.QuizGame.Controllers;

import com.balenii.QuizGame.Entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class UserController {

    @ModelAttribute("user")
    public User setUpUserForm() {
        return new User();
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/startQuiz")
    public String startQuiz(@ModelAttribute("user") User user) {
        // Save user details to session
        return "redirect:/quiz";
    }
}

