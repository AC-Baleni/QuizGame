package com.balenii.QuizGame.Repositories;

import com.balenii.QuizGame.Entities.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends MongoRepository<Quiz, String> {
}
