package com.example.desafiojava.service.component;

import com.example.desafiojava.persistense.Lotacao;
import com.example.desafiojava.persistense.repositories.LotacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarLotacao {

    private final LotacaoRepository lotacaoRepository;

    public List<Lotacao> listLotacao() {
        return lotacaoRepository.findAll();

    }


}
