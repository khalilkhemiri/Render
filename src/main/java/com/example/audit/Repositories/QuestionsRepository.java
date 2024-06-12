package com.example.audit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.audit.models.Questions;

import java.util.List;

public interface QuestionsRepository extends JpaRepository<Questions, Long> {
  List<Questions> findQuestionsByCriteria_Id(Long idCriteria);

}

