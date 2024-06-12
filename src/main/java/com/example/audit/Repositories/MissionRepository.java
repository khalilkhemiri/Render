package com.example.audit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.audit.models.Mission;

public interface MissionRepository extends JpaRepository<Mission, Long> {

}
