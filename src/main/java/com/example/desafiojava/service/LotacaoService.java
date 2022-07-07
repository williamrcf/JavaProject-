package com.example.desafiojava.service;

import com.example.desafiojava.dto.LotacaoDto;
import com.example.desafiojava.persistense.Lotacao;
import com.example.desafiojava.service.component.ListarLotacao;
import com.example.desafiojava.service.component.RegistrarLotacao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LotacaoService {

    private  final RegistrarLotacao registra;

    private final ListarLotacao lista;

    public LotacaoDto registrarLotacao (LotacaoDto lotacaoDto) {
        return registra.registrarLotacao(lotacaoDto);
    }
    public List<Lotacao> listLotacao () {
        return lista.listLotacao();
    }

    }




