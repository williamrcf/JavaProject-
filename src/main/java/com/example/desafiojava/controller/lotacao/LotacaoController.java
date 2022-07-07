package com.example.desafiojava.controller.lotacao;

import com.example.desafiojava.dto.LotacaoDto;
import com.example.desafiojava.persistense.Lotacao;
import com.example.desafiojava.service.LotacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/lotacoes")
public class LotacaoController {

    final LotacaoService service;

    @PostMapping
    ResponseEntity<LotacaoCriacaoResponse> register (@RequestBody LotacaoCriacaoRequest request) {
        LotacaoDto lotacaoDto = LotacaoDto.builder()
                .dataCadastro(request.getDataCadastro())
                .tipo(request.getTipo())
                .build();
        LotacaoDto lotacaoDtoSalva = service.registrarLotacao(lotacaoDto);

        LotacaoCriacaoResponse response = LotacaoCriacaoResponse.builder()
                .id(lotacaoDtoSalva.getId())
                .dataCadastro(lotacaoDtoSalva.getDataCadastro())
                .tipo(lotacaoDto.getTipo())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping
    ResponseEntity<List<Lotacao>> listByType(Lotacao tipo) {
        return ResponseEntity.ok(service.listLotacao());
    }

}

