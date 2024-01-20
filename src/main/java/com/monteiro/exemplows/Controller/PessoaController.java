package com.monteiro.exemplows.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monteiro.exemplows.Service.PessoaService;
import com.monteiro.exemplows.model.Pessoa;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping()
    public ResponseEntity<List<Pessoa>> lista() {
        return ResponseEntity.ok(service.pessoas());
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Pessoa> pessoa(@PathVariable String cpf) {
        return ResponseEntity.ok(service.pessoa(cpf));
    }

}
