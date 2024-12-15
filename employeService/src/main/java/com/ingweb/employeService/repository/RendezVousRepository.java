package com.ingweb.employeService.repository;

import com.ingweb.employeService.entity.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
    List<RendezVous> findByEmployeId(Long employeId);
    List<RendezVous> findByProfessionnelId(Long professionnelId);
}
