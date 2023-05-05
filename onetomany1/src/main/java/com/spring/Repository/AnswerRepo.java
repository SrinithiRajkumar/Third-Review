package com.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Model.Answer;

public interface AnswerRepo extends JpaRepository<Answer,Integer>{

}