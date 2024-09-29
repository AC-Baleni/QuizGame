package com.balenii.QuizGame.Repositories;

import com.balenii.QuizGame.Entities.Score;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends MongoRepository<Score, String> {
}
