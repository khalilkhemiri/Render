package com.example.audit.Services;

import com.example.audit.Repositories.DomainsRepository;
import com.example.audit.models.Domains;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DomainsService implements DomainsServiceImp {

    private final DomainsRepository domainsRepository;

    @Override
    public List<Domains> getAllDomains() {
        return domainsRepository.findAll();
    }

    @Override
    public Domains getDomainById(Long id) {
        Optional<Domains> domainOptional;
        domainOptional = domainsRepository.findById(id);
        return domainOptional.orElse(null);
    }

    @Override
    public Domains saveDomain(Domains domain) {
        return domainsRepository.save(domain);
    }

    @Override
    public void deleteDomain(Long id) {
        domainsRepository.deleteById(id);
    }


  @Override
  public List<Domains> getDomainsByAxeId(Long idAxe) {
    return domainsRepository.findDomainsByAxe_Id(idAxe);
  }




/*    public List<Domains> getAllDomains() {
        return domainsRepository.findAll();
    }

    public Domains getDomainById(Long id) {
        Optional<Domains> domainOptional = domainsRepository.findById(id);
        return domainOptional.orElse(null);
    }

    public Domains saveDomain(Domains domain) {
        return domainsRepository.save(domain);
    }

    public void deleteDomain(Long id) {
        domainsRepository.deleteById(id);
    }*/
}
