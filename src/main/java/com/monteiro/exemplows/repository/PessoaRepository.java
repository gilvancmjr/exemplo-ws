package com.monteiro.exemplows.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monteiro.exemplows.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long>{
    
    //@Query("from Pessoa p where p.cpf = :cpf")
    Optional<Pessoa> findByCpf(String cpf);
    
}
