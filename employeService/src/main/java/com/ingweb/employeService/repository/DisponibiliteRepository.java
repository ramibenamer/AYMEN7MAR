package com.ingweb.employeService.repository;

import com.ingweb.employeService.entity.Disponibilite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisponibiliteRepository extends JpaRepository<Disponibilite, Long> {
    List<Disponibilite> findByProfessionnelId(Long professionnelId);
}
