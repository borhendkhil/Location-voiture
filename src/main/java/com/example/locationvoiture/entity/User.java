package com.example.locationvoiture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private Role role;





}
