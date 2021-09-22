package com.management.app.finance.dto;

import com.management.app.comerce.dto.ProdutoDto;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ControleEstoqueDto {
    private ProdutoDto produto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Integer quantidadeEntrada;
    private Integer quantidadeSaida;
    private BigDecimal valorAtacado;
    private BigDecimal valorVarejo;
}
