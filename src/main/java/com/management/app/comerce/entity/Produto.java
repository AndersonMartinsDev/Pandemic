package com.management.app.comerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "seguimento")
    private SeguimentoEnum seguimento;

    @Column(name="descricao",length = 255)
    private String descricao;

    @Column(name="codigo_identificador",length = 100)
    private String codigoIdentificador;

    @Column(name="validade",length = 15)
    private LocalDate validade;
}
