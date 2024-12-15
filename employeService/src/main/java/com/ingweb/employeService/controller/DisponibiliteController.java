package com.ingweb.employeService.controller;

import com.ingweb.employeService.entity.Disponibilite;
import com.ingweb.employeService.service.DisponibiliteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/disponibilites")
public class DisponibiliteController {

    private final DisponibiliteService disponibiliteService;

    public DisponibiliteController(DisponibiliteService disponibiliteService) {
        this.disponibiliteService = disponibiliteService;
    }

    @GetMapping
    public List<Disponibilite> getAllDisponibilites() {
        return disponibiliteService.getAllDisponibilites();
    }

    @GetMapping("/{id}")
    public Optional<Disponibilite> getDisponibiliteById(@PathVariable Long id) {
        return disponibiliteService.getDisponibiliteById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Disponibilite createDisponibilite(@RequestBody Disponibilite disponibilite) {
        return disponibiliteService.createDisponibilite(disponibilite);
    }

    @PutMapping("/{id}")
    public Disponibilite updateDisponibilite(@PathVariable Long id, @RequestBody Disponibilite updatedDisponibilite) {
        return disponibiliteService.updateDisponibilite(id, updatedDisponibilite);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDisponibilite(@PathVariable Long id) {
        disponibiliteService.deleteDisponibilite(id);
    }

    @GetMapping("/professionnel/{professionnelId}")
    public List<Disponibilite> getDisponibilitesByProfessionnelId(@PathVariable Long professionnelId) {
        return disponibiliteService.getDisponibilitesByProfessionnelId(professionnelId);
    }
}
