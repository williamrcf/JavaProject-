package com.example.desafiojava.service;

import com.example.desafiojava.dto.LotacaoDto;
import com.example.desafiojava.persistense.Lotacao;
import com.example.desafiojava.persistense.repositories.LotacaoRepository;
import com.example.desafiojava.service.component.RegistrarLotacao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;


@RunWith(SpringRunner.class)
public class LotacaoServiceTest {

    @Mock
    private LotacaoService service;

   @Mock
   private LotacaoRepository respository;


    @Test
   public void registrarLotacao() {

        Lotacao lotacao = new Lotacao();
        lotacao.setId(UUID.randomUUID());
        Mockito.when(respository.save()).thenReturn(new Lotacao());


        // input

        LotacaoDto lotacaoDto = new LotacaoDto();
        lotacaoDto.setTipo("secundaria");
        lotacaoDto.setDataCadastro(Instant.parse("2017-09-08T15:25:53Z"));

        //execute
       LotacaoDto lotacaoDtoTeste = service.registrarLotacao(lotacaoDto);


       //assert
        System.out.println("");
    }
}