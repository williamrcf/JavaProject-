package com.example.desafiojava.controller;

import com.example.desafiojava.dto.ServidorDto;
import com.example.desafiojava.persistense.Servidor;
import com.example.desafiojava.service.ServidorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class ServidorController {

    final ServidorService service;
    }







