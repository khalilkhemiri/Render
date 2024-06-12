package com.example.audit.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@Setter
@Getter
public class Domains {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nom;
  private Float poid;

  @ManyToOne(cascade = CascadeType.ALL)
  private Axe axe;
  @JsonIgnore
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "domains")
  private Set<Criteria> criteria;

  public Domains()  {}

  public Domains(String nom)  {
    this.nom = nom;
  }

}
