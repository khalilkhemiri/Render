package com.example.audit.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Questions {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    private String Value;
    @ManyToOne
    @JoinColumn(name = "criteria")
    private Criteria criteria;

    public Questions()  {}
    public Questions(String val)  {
        this.Value = Value;
    }

    public void setVal(String Value) {
        this.Value = Value;
    }
}


