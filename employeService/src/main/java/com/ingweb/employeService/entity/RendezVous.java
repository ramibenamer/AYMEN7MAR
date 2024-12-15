package com.ingweb.employeService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateHeure;
    
    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employe employe;

    @ManyToOne
    @JoinColumn(name = "professionnel_id")
    private Professionnel professionnel;

    @Enumerated(EnumType.STRING)
    private StatutRendezVous statut;

    public enum StatutRendezVous {
        LIBRE, EN_ATTENTE, CONFIRME
    }
}
