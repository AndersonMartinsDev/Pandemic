package com.management.app.comerce.dto;

import com.management.app.comerce.entity.SeguimentoEnum;
import lombok.Data;

@Data
public class ProdutoDto {
    private SeguimentoEnum seguimento;
    private String descricao;
    private String codigoIdentificador;
}
