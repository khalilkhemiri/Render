package com.example.audit.Services;

import com.example.audit.Repositories.CriteriaRepository;
import com.example.audit.models.Criteria;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CriteriaService implements CriteriaServiceImp {


    private final CriteriaRepository criteriaRepository;



  /* @Override

   public List<Sub_domains> getAllSubDomains() {
        return;
    }

    public Sub_domains getSubDomainById(Long id) {
        Optional<Sub_domains> subDomainOptional = subDomainsRepository.findById(id);
        return subDomainOptional.orElse(null);
    }

    public Sub_domains saveSubDomain(Sub_domains subDomain) {
        return subDomainsRepository.save(subDomain);
    }

    @Override
    public List<Sub_domains> getAllSub_domains() {
        return null;
    }*/

    @Override
    public List<Criteria> getAllCriteria() {
        return criteriaRepository.findAll();

    }

    @Override
    public Criteria getCriteriaById(Long id) {
        return null;
    }

    @Override
    public Criteria saveCriteria(Criteria subDomain) {
        return null;
    }

    @Override
    public void deleteCriteria(Long id) {
        criteriaRepository.deleteById(id);
    }
  @Override
  public List<Criteria> getCriteriasByDomains(Long idDomains) {
    return criteriaRepository.findCriteriaByDomains_Id(idDomains);

  }
}

