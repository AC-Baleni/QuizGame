package com.balenii.QuizGame.Repositories;

import com.balenii.QuizGame.Entities.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends MongoRepository<Admin, String> {

    Admin findByUsernameAndPassword(String username, String password);
}
