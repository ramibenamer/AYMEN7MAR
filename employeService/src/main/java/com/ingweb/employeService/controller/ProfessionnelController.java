package com.ingweb.employeService.controller;

import com.ingweb.employeService.entity.Professionnel;
import com.ingweb.employeService.service.ProfessionnelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professionnels")
public class ProfessionnelController {

    private final ProfessionnelService professionnelService;

    public ProfessionnelController(ProfessionnelService professionnelService) {
        this.professionnelService = professionnelService;
    }

    // Récupérer tous les professionnels
    @GetMapping
    public List<Professionnel> getAllProfessionnels() {
        return professionnelService.getAllProfessionnels();
    }

    // Sauvegarder un professionnel
    @PostMapping
    public Professionnel saveProfessionnel(@RequestBody Professionnel professionnel) {
        return professionnelService.saveProfessionnel(professionnel);
    }

    // Supprimer un professionnel
    @DeleteMapping("/{id}")
    public void deleteProfessionnel(@PathVariable Long id) {
        professionnelService.deleteProfessionnel(id);
    }

    // Récupérer un professionnel par ID
    @GetMapping("/{id}")
    public Professionnel getProfessionnelById(@PathVariable Long id) {
        return professionnelService.getProfessionnelById(id);
    }
}
