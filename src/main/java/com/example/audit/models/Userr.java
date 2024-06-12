package com.example.audit.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;





@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Userr {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Getter
    private String email;
    @Setter
    @Getter
    private String motdepasse;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Userr")
    private Set <Mission> Mission;




}
















