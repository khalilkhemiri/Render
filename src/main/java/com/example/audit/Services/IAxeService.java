package com.example.audit.Services;

import com.example.audit.models.Axe;
import com.example.audit.models.Domains;

import java.util.List;
import java.util.Set;


public interface IAxeService {

    List<Axe> getAllAxes();

    Axe getAxeById(Long id);

    Axe saveAxe(Axe axe);

    void deleteAxe(Long id);

    Set<Domains> getDomainsByAxeId(Long axeId);

    List<Axe> getAxesByMissionId(Long missionId);
}
