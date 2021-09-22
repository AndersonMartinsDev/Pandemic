package com.management.app.finance.usecase;

import com.management.app.finance.dto.ControleEstoqueDto;
import com.management.app.finance.entity.ControleEstoque;
import com.management.app.finance.mapper.ControleEstoqueMapper;
import com.management.app.finance.repository.ControleEstoqueRepository;
import com.management.util.structural.UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public class UcListarControleEstoque implements UseCase<List<ControleEstoqueDto>> {

    @Autowired
    private ControleEstoqueRepository repository;


    @Override
    public List<ControleEstoqueDto> run() {
        return convert(ControleEstoqueMapper.class).toListControleEstoqueDto(repository.findAll());
    }
}
