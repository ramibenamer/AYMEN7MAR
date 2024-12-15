package com.ingweb.employeService.service;

import com.ingweb.employeService.entity.Disponibilite;
import com.ingweb.employeService.repository.DisponibiliteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisponibiliteService {

    private final DisponibiliteRepository disponibiliteRepository;

    public DisponibiliteService(DisponibiliteRepository disponibiliteRepository) {
        this.disponibiliteRepository = disponibiliteRepository;
    }

    public List<Disponibilite> getAllDisponibilites() {
        return disponibiliteRepository.findAll();
    }

    public Optional<Disponibilite> getDisponibiliteById(Long id) {
        return disponibiliteRepository.findById(id);
    }

    public Disponibilite createDisponibilite(Disponibilite disponibilite) {
        return disponibiliteRepository.save(disponibilite);
    }

    public Disponibilite updateDisponibilite(Long id, Disponibilite updatedDisponibilite) {
        updatedDisponibilite.setId(id);
        return disponibiliteRepository.save(updatedDisponibilite);
    }

    public void deleteDisponibilite(Long id) {
        disponibiliteRepository.deleteById(id);
    }

    public List<Disponibilite> getDisponibilitesByProfessionnelId(Long professionnelId) {
        return disponibiliteRepository.findByProfessionnelId(professionnelId);
    }
}
