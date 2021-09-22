package com.management.app.finance.repository;

import com.management.app.finance.entity.ControleEstoque;
import com.management.util.structural.GenericRespository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControleEstoqueRepository extends GenericRespository<ControleEstoque, Long> {
}
