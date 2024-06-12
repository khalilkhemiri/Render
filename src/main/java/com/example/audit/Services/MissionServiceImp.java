package com.example.audit.Services;



import com.example.audit.models.Mission;

import java.util.List;

public interface MissionServiceImp {

    List<Mission> getAllMissions();

    Mission getMissionById(Long id);

    Mission saveMission(Mission mission);

    void deleteMission(Long id);
}
