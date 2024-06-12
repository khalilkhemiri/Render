package com.example.audit.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Axe implements Serializable {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nom;
  @JsonIgnore
  @ManyToMany(cascade = CascadeType.ALL, mappedBy = "axes")
  private List<Mission> missions;
  @JsonIgnore
  @OneToMany(cascade =CascadeType.ALL, mappedBy = "axe")
  private Set<Domains> Domains;


  public Axe(String nom)  {
    this.nom = nom;
  }

}
