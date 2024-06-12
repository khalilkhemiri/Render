package com.example.audit.Services;

import com.example.audit.models.Criteria;

import java.util.List;

public interface CriteriaServiceImp {

    List<Criteria> getAllCriteria();

    Criteria getCriteriaById(Long id);

    Criteria saveCriteria(Criteria subDomain);

    default void deleteCriteria(Long id) {

    }

    List<Criteria> getCriteriasByDomains(Long idDomains);
}


