package com.example.locationvoiture.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor


public class Location {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String dateDebut;
    private String dateFin;
    private String lieuDepart;
    private String lieuArrivee;
    @ManyToOne
    private Car car;
    @ManyToOne
    private User user;
    private Double prix;


}
