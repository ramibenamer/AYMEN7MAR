package com.ingweb.employeService.controller;

import com.ingweb.employeService.entity.RendezVous;
import com.ingweb.employeService.service.RendezVousService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rendezvous")
public class RendezVousController {

    private final RendezVousService rendezVousService;

    public RendezVousController(RendezVousService rendezVousService) {
        this.rendezVousService = rendezVousService;
    }

    @GetMapping
    public List<RendezVous> getAllRendezVous() {
        return rendezVousService.getAllRendezVous();
    }

    @GetMapping("/{id}")
    public Optional<RendezVous> getRendezVousById(@PathVariable Long id) {
        return rendezVousService.getRendezVousById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RendezVous createRendezVous(@RequestBody RendezVous rendezVous) {
        return rendezVousService.createRendezVous(rendezVous);
    }

    @PutMapping("/{id}")
    public RendezVous updateRendezVous(@PathVariable Long id, @RequestBody RendezVous updatedRendezVous) {
        return rendezVousService.updateRendezVous(id, updatedRendezVous);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRendezVous(@PathVariable Long id) {
        rendezVousService.deleteRendezVous(id);
    }

    @GetMapping("/employe/{employeId}")
    public List<RendezVous> getRendezVousByEmployeId(@PathVariable Long employeId) {
        return rendezVousService.getRendezVousByEmployeId(employeId);
    }

    @GetMapping("/professionnel/{professionnelId}")
    public List<RendezVous> getRendezVousByProfessionnelId(@PathVariable Long professionnelId) {
        return rendezVousService.getRendezVousByProfessionnelId(professionnelId);
    }
}
