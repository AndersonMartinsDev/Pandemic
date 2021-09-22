package com.management.app.finance.mapper;

import com.management.app.finance.dto.ControleEstoqueDto;
import com.management.app.finance.entity.ControleEstoque;
import com.management.app.finance.usecase.UcInserirControleEstoque;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ControleEstoqueMapper {
    ControleEstoque toControleEstoque(UcInserirControleEstoque object);
    ControleEstoqueDto toControleEstoqueDto(ControleEstoque entity);
    List<ControleEstoqueDto> toListControleEstoqueDto(List<ControleEstoque> lista);
}
