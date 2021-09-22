package com.management.app.comerce.mapper;

import com.management.app.comerce.dto.ProdutoResumoDto;
import com.management.app.comerce.entity.Produto;
import com.management.app.comerce.usecase.UcIncluirProduto;
import org.mapstruct.Mapper;


@Mapper
public interface ProdutoMapper {
    ProdutoResumoDto toProdutoResumoDto(Produto entity);
    Produto toProduto(UcIncluirProduto uc);
}
