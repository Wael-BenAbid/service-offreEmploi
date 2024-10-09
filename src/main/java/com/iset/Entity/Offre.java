package com.iset.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long code;
    private String intitule;
    private String specialite;
    private String societe;
    private int nbpostes;
    private String pays;

    public Offre(String intitule, String specialite, String societe, int nbpostes, String pays) {
        this.intitule = intitule;
        this.specialite = specialite;
        this.societe = societe;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }
}
