package com.condominio.ateus.model.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    private Apartameto apartameto;
}
