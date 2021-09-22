package com.management.app.finance.entity;

import com.management.app.comerce.entity.Produto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="historico_venda")
public class HistoricoVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Produto> produtos;

    @Column(name="data_hora")
    private LocalDateTime dataHora;

}
