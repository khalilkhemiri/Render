package com.example.audit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.audit.models.Criteria;

import java.util.List;

public interface CriteriaRepository extends JpaRepository<Criteria, Long> {
  List<Criteria> findCriteriaByDomains_Id(Long idDomains);

}
