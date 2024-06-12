package com.example.audit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.audit.models.Domains;

import java.util.List;

public interface DomainsRepository extends JpaRepository<Domains, Long> {
  List<Domains> findDomainsByAxe_Id(Long idAxe);

}
