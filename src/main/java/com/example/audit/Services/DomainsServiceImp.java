package com.example.audit.Services;


import com.example.audit.models.Domains;

import java.util.List;

public interface DomainsServiceImp {

    List<Domains> getAllDomains();

    Domains getDomainById(Long id);

    Domains saveDomain(Domains domain);

    void deleteDomain(Long id);

    List<Domains> getDomainsByAxeId(Long idAxe);
}
