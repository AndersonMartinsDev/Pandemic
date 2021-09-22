package com.management.app.comerce.repository;

import com.management.app.comerce.entity.Produto;
import com.management.util.structural.GenericRespository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends GenericRespository<Produto,Long> {
}
