package com.ingweb.employeService.service;

import com.ingweb.employeService.entity.Professionnel;
import com.ingweb.employeService.repository.ProfessionnelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessionnelService {

    private final ProfessionnelRepository professionnelRepository;

    public ProfessionnelService(ProfessionnelRepository professionnelRepository) {
        this.professionnelRepository = professionnelRepository;
    }

    // Récupérer tous les professionnels
    public List<Professionnel> getAllProfessionnels() {
        return professionnelRepository.findAll();
    }

    // Sauvegarder un professionnel
    public Professionnel saveProfessionnel(Professionnel professionnel) {
        return professionnelRepository.save(professionnel);
    }

    // Supprimer un professionnel
    public void deleteProfessionnel(Long id) {
        professionnelRepository.deleteById(id);
    }

    // Récupérer un professionnel par ID
    public Professionnel getProfessionnelById(Long id) {
        Optional<Professionnel> professionnel = professionnelRepository.findById(id);
        if (professionnel.isPresent()) {
            return professionnel.get();
        } else {
            throw new RuntimeException("Professionnel avec l'ID " + id + " non trouvé");
        }
    }
}
