package com.example.locationvoiture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Car {
    @Id
    private Long id;
    private String marque;
    private String modele;
    private String immatriculation;
    private String couleur;

}
