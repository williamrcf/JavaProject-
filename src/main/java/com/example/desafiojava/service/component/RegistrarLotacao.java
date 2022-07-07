package com.example.desafiojava.service.component;

import com.example.desafiojava.dto.LotacaoDto;
import com.example.desafiojava.persistense.Lotacao;
import com.example.desafiojava.persistense.repositories.LotacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RegistrarLotacao {

    private final LotacaoRepository lotacaoRepository;

    public LotacaoDto registrarLotacao (LotacaoDto lotacaoDto) {

        Lotacao lotacao = Lotacao.builder()
                .id(UUID.randomUUID())
                .dataCadastro(lotacaoDto.getDataCadastro())
                .tipo(lotacaoDto.getTipo()).build();
        Lotacao lotacaoSalva = lotacaoRepository.save(lotacao);

        lotacaoDto.setId(lotacaoSalva.getId());

        return lotacaoDto;
    }
}
