package com.example.desafiojava.persistense.repositories;

import com.example.desafiojava.persistense.Lotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LotacaoRepository extends JpaRepository <Lotacao, UUID>  {
}
