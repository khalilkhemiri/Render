package com.example.audit.models;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mission implements Serializable {

  @Setter
  @Getter
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Setter
  @Getter
  private String nom;
  @Setter
  @Getter
  private int enCours;
  @Setter
  @Getter
  private LocalDate dateDebut;
  @Setter
  @Getter
  private Date dateFin;
  @ManyToOne
  @JoinColumn(name = "Userr")
  Userr Userr;
  @ManyToMany
  @JoinTable(
    name = "mission_axe",
    joinColumns = @JoinColumn(name = "mission_id"),
    inverseJoinColumns = @JoinColumn(name = "axe_id")
  )
  private List<Axe> axes;


}
