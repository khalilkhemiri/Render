package com.example.audit.Services;

import com.example.audit.models.Questions;
import com.example.audit.Repositories.QuestionsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class QuestionsService implements QuestionsServiceImp  {

    private final QuestionsRepository questionsRepository;

    @Override
    public List<Questions> getAllQuestions() {
        return questionsRepository.findAll();
    }

    @Override
    public Questions getQuestionById(Long id) {
        Optional<Questions> questionOptional = questionsRepository.findById(id);
        return questionOptional.orElse(null);
    }

    @Override
    public Questions saveQuestion(Questions question) {
        return questionsRepository.save(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        questionsRepository.deleteById(id);
    }
  @Override
  public List<Questions> getQuestionsByCriteria(Long idCriteria) {
    return questionsRepository.findQuestionsByCriteria_Id(idCriteria);
  }

}
