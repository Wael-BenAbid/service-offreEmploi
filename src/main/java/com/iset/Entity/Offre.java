package com.iset.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Offre {
    @Id
    @GeneratedValue
    long code;
    String intitulé;
    String specialité;
    String société;
    int nbpostes;
    String pays;
}
