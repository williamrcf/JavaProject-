package com.example.desafiojava.persistense;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Data
@Table (name = "servidor")
public class Servidor {

    @Id
    public UUID matricula;
    @Column
    public String nome;
    @Column (name = "data_de_cadastro")
    public Date dataDeCadastro;
    @Column
    public UUID lotacao;

    public Servidor(Date dataDeCadastro, String nome) {
        this.dataDeCadastro = dataDeCadastro;
        this.nome = nome;
    }
}

