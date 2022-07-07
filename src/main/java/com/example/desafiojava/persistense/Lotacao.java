package com.example.desafiojava.persistense;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "lotacao")
public class Lotacao {

    @Id
    private UUID id;
    @Column
    private String tipo;
    @Column (name = "data_cadastro")
    private Instant dataCadastro;

}





