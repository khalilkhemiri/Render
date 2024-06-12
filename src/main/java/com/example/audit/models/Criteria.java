package com.example.audit.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Data
public class Criteria {

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
  private Float poid;
  @ManyToOne
  @JoinColumn(name = "domains_id")
  private Domains domains ;
  @JsonIgnore
  @OneToMany (cascade =CascadeType.ALL, mappedBy = "criteria")
  private Set<Questions> Questions;

  public Criteria()  {}
  public Criteria(String nom)  {
    this.nom = nom;
  }

}
