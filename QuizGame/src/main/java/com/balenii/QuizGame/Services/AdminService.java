package com.balenii.QuizGame.Services;

import com.balenii.QuizGame.Entities.Admin;
import com.balenii.QuizGame.Repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin login(String username, String password) {
        return adminRepository.findByUsernameAndPassword(username, password);
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

}
