package com.management.external.finance.controller;

import com.management.app.finance.dto.ControleEstoqueDto;
import com.management.app.finance.usecase.UcInserirControleEstoque;
import com.management.app.finance.usecase.UcListarControleEstoque;
import com.management.util.structural.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("controle-estoque")
public class ControleEstoqueController {

    @Autowired
    private Facade facade;

    @GetMapping
    public ControleEstoqueDto listar(UcListarControleEstoque filtrar){
        return facade.run(filtrar);
    }

    @PostMapping
    public void inserir(@RequestBody UcInserirControleEstoque uc){
         facade.run(uc);
    }
}
