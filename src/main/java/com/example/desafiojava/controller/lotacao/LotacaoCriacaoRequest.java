package com.example.desafiojava.controller.lotacao;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class LotacaoCriacaoRequest {

    @NotNull
    private String tipo;

    @NotNull
    private Instant dataCadastro;

    public LotacaoCriacaoRequest() {

    }
}
