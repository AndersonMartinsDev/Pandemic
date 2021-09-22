package com.management.external.comerce.controller;

import com.management.app.comerce.entity.Produto;
import com.management.app.comerce.usecase.UcIncluirProduto;
import com.management.app.comerce.usecase.UcListarProduto;
import com.management.util.structural.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private Facade facade;

    @GetMapping
    public List<Produto> listar(){
        return facade.run(new UcListarProduto());
    };

    @PostMapping
    public ResponseEntity insert(@RequestBody UcIncluirProduto uc){
        return facade.run(uc);
    }
}
