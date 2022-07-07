package com.example.desafiojava.controller.lotacao;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Builder
public class LotacaoCriacaoResponse {

    @NotNull
    private UUID id;

    @NotNull
    private String tipo;

    @NotNull
    private Instant dataCadastro;
}
