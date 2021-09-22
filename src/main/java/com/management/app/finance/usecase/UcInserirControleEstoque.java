package com.management.app.finance.usecase;


import com.management.app.comerce.dto.ProdutoDto;
import com.management.app.comerce.dto.ProdutoResumoDto;
import com.management.app.comerce.entity.Produto;
import com.management.app.finance.entity.ControleEstoque;
import com.management.app.finance.mapper.ControleEstoqueMapper;
import com.management.app.finance.repository.ControleEstoqueRepository;
import com.management.util.structural.UseCase;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
public class UcInserirControleEstoque implements UseCase<Void> {

    @Autowired
    private ControleEstoqueRepository repository;

    private ProdutoDto produto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Integer quantidadeEntrada;
    private Integer quantidadeSaida;
    private BigDecimal valorAtacado;
    private BigDecimal valorVarejo;

    @Override
    public Void run() {
        ControleEstoque entity = convert(ControleEstoqueMapper.class).toControleEstoque(this);
        repository.save(entity);
        return null;
    }

}
