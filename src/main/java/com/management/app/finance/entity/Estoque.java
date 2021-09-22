package com.management.app.finance.entity;

import com.management.app.comerce.entity.Produto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="estoque")
public class Estoque{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Produto> produtos;

    @Column(name="investimentoInicial")
    private BigDecimal investimentoInicial;

    @Column(name="saldo")
    private BigDecimal saldo;
}
