package com.example.desafiojava.dto;

import com.sun.istack.NotNull;
import lombok.*;

import java.time.Instant;
import java.util.UUID;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LotacaoDto {

    private UUID id;

    private String tipo;

    private Instant dataCadastro;


}
