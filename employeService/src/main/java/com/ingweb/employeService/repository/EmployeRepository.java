package com.ingweb.employeService.repository;

import com.ingweb.employeService.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
