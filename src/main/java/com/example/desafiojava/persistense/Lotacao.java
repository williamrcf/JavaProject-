package com.example.desafiojava.persistense;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.util.UUID;


@Entity
@NoArgsConstructor
@Data
@Table (name = "lotacao")
public class Lotacao {


    @Id
    public UUID id;
    @Column
    public String tipo;
    @Column (name = "data_cadastro")
    public Instant dataCadastro;

}

