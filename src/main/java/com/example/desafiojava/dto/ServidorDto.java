package com.example.desafiojava.dto;

import com.sun.istack.NotNull;

import java.sql.Date;
import java.util.UUID;

public class ServidorDto {

    @NotNull
    public UUID matricula;

    @NotNull
    public String nome;

    @NotNull
    public Date dataDeCadastro;

    @NotNull
    public UUID lotacao;
}
