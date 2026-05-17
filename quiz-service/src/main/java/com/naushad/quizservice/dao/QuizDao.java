package com.naushad.quizservice.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.naushad.quizservice.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
