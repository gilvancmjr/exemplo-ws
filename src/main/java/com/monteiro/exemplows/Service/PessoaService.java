package com.monteiro.exemplows.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monteiro.exemplows.model.Pessoa;
import com.monteiro.exemplows.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> pessoas() {
        return repository.findAll();
    }

    public Pessoa pessoa(String cpf) {
        return repository.findByCpf(cpf).orElseThrow(() -> new RuntimeException("não encontrado"));
    }

}
