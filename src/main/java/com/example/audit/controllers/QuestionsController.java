package com.example.audit.controllers;

import com.example.audit.models.Questions;
import com.example.audit.Services.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Questions")
public class QuestionsController {

    @Autowired
    private QuestionsService questionsService;

    @GetMapping
    public ResponseEntity<List<Questions>> getAllQuestions() {
        List<Questions> questions = questionsService.getAllQuestions();
        return ResponseEntity.ok(questions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Questions> getQuestionById(@PathVariable Long id) {
        Questions question = questionsService.getQuestionById(id);
        if (question == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(question);
    }

    @PostMapping
    public ResponseEntity<Questions> createQuestion(@RequestBody Questions question) {
        Questions savedQuestion = questionsService.saveQuestion(question);
        return ResponseEntity.ok(savedQuestion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        questionsService.deleteQuestion(id);
        return ResponseEntity.noContent().build();
    }
  @GetMapping("/getQuestionByCriteria/{id}")
  public ResponseEntity<List<Questions>> getQuestionByCriteria(@PathVariable Long id) {
    List<Questions> questions = questionsService.getQuestionsByCriteria(id);
    if (questions == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(questions);
  }
}


