package com.example.audit.Services;

import com.example.audit.models.Mission;
import com.example.audit.Repositories.MissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MissionService implements MissionServiceImp {

    private final MissionRepository missionRepository;

   @Override
   public List<Mission> getAllMissions() {
        return missionRepository.findAll();
    }

    @Override
    public Mission getMissionById(Long id) {
        Optional<Mission> missionOptional = missionRepository.findById(id);
        return missionOptional.orElse(null);
    }

   @Override
   public Mission saveMission(Mission mission) {
        return missionRepository.save(mission);
    }

   @Override
   public void deleteMission(Long id) {
        missionRepository.deleteById(id);
    }
}
