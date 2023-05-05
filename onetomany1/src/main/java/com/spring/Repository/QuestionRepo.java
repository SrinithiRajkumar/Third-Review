package com.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Model.Question;

public interface QuestionRepo extends JpaRepository<Question,Integer>{

}

