package com.example.audit.controllers;

import com.example.audit.models.Mission;
import com.example.audit.Services.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Mission")
public class MissionController {

    @Autowired
    private MissionService missionService;

    @GetMapping("/retrieve-all-mission")
    public ResponseEntity<List <Mission>> getAllMission() {
        List<Mission> mission = missionService.getAllMissions();
        return ResponseEntity.ok(mission);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mission> getMissionById(@PathVariable Long id) {
        Mission mission = missionService.getMissionById(id);
        if (mission == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(mission);
    }

    @PostMapping("/add")
    public ResponseEntity<Mission> createMission(@RequestBody Mission mission) {
        Mission savedMission = missionService.saveMission(mission);
        return ResponseEntity.ok(savedMission);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMission(@PathVariable Long id) {
        missionService.deleteMission(id);
        return ResponseEntity.noContent().build();
    }
}
