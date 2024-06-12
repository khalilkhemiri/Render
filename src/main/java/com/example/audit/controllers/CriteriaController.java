package com.example.audit.controllers;

import com.example.audit.Services.CriteriaService;
import com.example.audit.models.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/criteria")
public class CriteriaController {

    @Autowired
    private CriteriaService criteriaService;

    @GetMapping("/retrieve-all-criteria")
    public ResponseEntity<List<Criteria>> getAllCriteria() {
        List<Criteria> criteriaList = criteriaService.getAllCriteria();
        return ResponseEntity.ok(criteriaList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Criteria> getCriteriaById(@PathVariable Long id) {
        Criteria criteria = criteriaService.getCriteriaById(id);
        if (criteria == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(criteria);
    }

    @PostMapping
    public ResponseEntity<Criteria> createCriteria(@RequestBody Criteria criteria) {
        Criteria savedCriteria = criteriaService.saveCriteria(criteria);
        return ResponseEntity.ok(savedCriteria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCriteria(@PathVariable Long id) {
        criteriaService.deleteCriteria(id);
        return ResponseEntity.noContent().build();
    }
  @GetMapping("/getCriteriaByDomaine/{id}")
  public ResponseEntity<List<Criteria>> getCriteriasByDomaine(@PathVariable Long id) {
    List<Criteria> criterias = criteriaService.getCriteriasByDomains(id);
    if (criterias == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(criterias);
  }
}
