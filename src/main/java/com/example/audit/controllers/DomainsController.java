package com.example.audit.controllers;

import com.example.audit.models.Domains;
import com.example.audit.Services.DomainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/domaines")
public class DomainsController {

    @Autowired
    private DomainsService domainsService;

    @GetMapping
    public ResponseEntity<List<Domains>> getAllDomains() {
        List<Domains> domains = domainsService.getAllDomains();
        return ResponseEntity.ok(domains);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Domains> getDomainById(@PathVariable Long id) {
        Domains domain = domainsService.getDomainById(id);
        if (domain == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(domain);
    }

    @PostMapping
    public ResponseEntity<Domains> createDomain(@RequestBody Domains domains) {
        Domains savedDomains = domainsService.saveDomain(domains);
        return ResponseEntity.ok(savedDomains);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDomain(@PathVariable Long id) {
        domainsService.deleteDomain(id);
        return ResponseEntity.noContent().build();
     }
  @GetMapping("/findDomainByAxe/{id}")
  public ResponseEntity<List<Domains>> getDomainByAxe(@PathVariable Long id) {
    List<Domains> domains = domainsService.getDomainsByAxeId(id);
    return ResponseEntity.ok(domains);
  }
}
