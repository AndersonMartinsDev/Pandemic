package com.management.app.finance.entity;

import com.management.app.comerce.entity.Produto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="controle_estoque")
public class ControleEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.REFRESH)
    private Produto produto;

    @Column(name="data_entrada")
    private LocalDate dataEntrada;

    @Column(name="dataSaida")
    private LocalDate dataSaida;

    @Column(name="quantidade_entrada")
    private Integer quantidadeEntrada;

    @Column(name="quantidade_saida")
    private Integer quantidadeSaida;

    @Column(name="valor_atacado")
    private BigDecimal valorAtacado;

    @Column(name="valor_varejo")
    private BigDecimal valorVarejo;
}
