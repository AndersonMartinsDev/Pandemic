package com.management.app.comerce.usecase;

import com.management.app.comerce.entity.Produto;
import com.management.app.comerce.entity.SeguimentoEnum;
import com.management.app.comerce.mapper.ProdutoMapper;
import com.management.app.comerce.repository.ProdutoRepository;
import com.management.util.structural.UseCase;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@Setter
public class UcIncluirProduto implements UseCase<Void> {

    @Autowired
    private ProdutoRepository repository;

    private SeguimentoEnum seguimento;
    private String descricao;
    private String codigoIdentificador;

    @Override
    public Void run() {
        Produto entity = convert(ProdutoMapper.class).toProduto(this);
        repository.save(entity);
        return null ;
    }
}
