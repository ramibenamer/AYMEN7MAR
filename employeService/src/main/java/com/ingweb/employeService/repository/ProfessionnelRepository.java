package com.ingweb.employeService.repository;

import com.ingweb.employeService.entity.Professionnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionnelRepository extends JpaRepository<Professionnel, Long> {
}
