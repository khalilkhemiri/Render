package com.example.audit.Services;



import com.example.audit.models.Questions;

import java.util.List;

public interface QuestionsServiceImp {

    List<Questions> getAllQuestions();

    Questions getQuestionById(Long id);

    Questions saveQuestion(Questions question);

    void deleteQuestion(Long id);

    List<Questions> getQuestionsByCriteria(Long idCriteria);
}
