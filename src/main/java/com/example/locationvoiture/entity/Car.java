package com.example.locationvoiture.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Car {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String marque;
    private String modele;
    private String nbPlaces;
    private String immatriculation;
    private String couleur;



}
