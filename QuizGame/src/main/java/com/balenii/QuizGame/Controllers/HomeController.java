package com.balenii.QuizGame.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/check")
    public String checker() {
        return "I WORK!!!!";
    }
}
