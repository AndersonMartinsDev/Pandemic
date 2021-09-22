package com.management.app.finance.dto;

import com.management.app.comerce.entity.Produto;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class EstoqueDto {
    private List<Produto> produtos;
    private BigDecimal investimentoInicial;
    private BigDecimal saldo;
}
