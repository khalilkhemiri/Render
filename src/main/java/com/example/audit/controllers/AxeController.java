package com.example.audit.controllers;

import com.example.audit.Services.IAxeService;
import com.example.audit.models.Axe;
import com.example.audit.models.Domains;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/axes")
//@AllArgsConstructor
public class AxeController {
    @Autowired
    private IAxeService axeService;



    @GetMapping
    public ResponseEntity<List<Axe>> getAllAxes() {
        List<Axe> axes = axeService.getAllAxes();
        return ResponseEntity.ok(axes);
    }
    @GetMapping("/domains/{id}")
    public Set<Domains> getDomainsByAxeId(@PathVariable Long id) {
        return axeService.getDomainsByAxeId(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Axe> getAxeById(@PathVariable Long id) {
        Axe axe = axeService.getAxeById(id);
        if (axe == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(axe);
    }

    @PostMapping
    public ResponseEntity<Axe> createAxe(@RequestBody Axe axe) {
        Axe savedAxe = axeService.saveAxe(axe);
        return ResponseEntity.ok(savedAxe);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAxe(@PathVariable Long id) {
        axeService.deleteAxe(id);
        return ResponseEntity.noContent().build();
    }
  @GetMapping("/getAxeByMission/{id}")
  public ResponseEntity<List<Axe>> getAxeByMissionId(@PathVariable Long id) {
    List<Axe> axes = axeService.getAxesByMissionId(id);
    return ResponseEntity.ok(axes);
  }
}
