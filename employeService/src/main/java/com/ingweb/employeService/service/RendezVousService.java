package com.ingweb.employeService.service;

import com.ingweb.employeService.entity.RendezVous;
import com.ingweb.employeService.repository.RendezVousRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RendezVousService {

    private final RendezVousRepository rendezVousRepository;

    public RendezVousService(RendezVousRepository rendezVousRepository) {
        this.rendezVousRepository = rendezVousRepository;
    }

    public List<RendezVous> getAllRendezVous() {
        return rendezVousRepository.findAll();
    }

    public Optional<RendezVous> getRendezVousById(Long id) {
        return rendezVousRepository.findById(id);
    }

    public RendezVous createRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    public RendezVous updateRendezVous(Long id, RendezVous updatedRendezVous) {
        updatedRendezVous.setId(id);
        return rendezVousRepository.save(updatedRendezVous);
    }

    public void deleteRendezVous(Long id) {
        rendezVousRepository.deleteById(id);
    }

    public List<RendezVous> getRendezVousByEmployeId(Long employeId) {
        return rendezVousRepository.findByEmployeId(employeId);
    }

    public List<RendezVous> getRendezVousByProfessionnelId(Long professionnelId) {
        return rendezVousRepository.findByProfessionnelId(professionnelId);
    }
}
