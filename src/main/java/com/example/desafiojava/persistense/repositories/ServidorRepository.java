package com.example.desafiojava.persistense.repositories;

import com.example.desafiojava.persistense.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ServidorRepository extends JpaRepository <Servidor, UUID> {

}
