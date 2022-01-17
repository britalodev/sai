package br.com.italo.sai.rest.controller;

import br.com.italo.sai.persistence.entity.contato.ConfiabilidadeContato;
import br.com.italo.sai.persistence.entity.contato.Recompensa;
import br.com.italo.sai.persistence.entity.contato.TipoDeContato;
import br.com.italo.sai.service.contato.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "contato", produces = "application/json")
@Configuration
@CrossOrigin
public class ContatoController {

    @Autowired
    private ContatoService contatoService;



    @PostMapping(value = "tipo", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TipoDeContato> addTipoContato(@RequestBody final TipoDeContato tipoDeContato){
        final TipoDeContato contatoCriado = contatoService.addTipoDeContato(tipoDeContato);
        return new ResponseEntity<TipoDeContato>(contatoCriado, HttpStatus.CREATED);
    }
    @PostMapping(value = "confiabilidade", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ConfiabilidadeContato> addConfiabilidade(@RequestBody final ConfiabilidadeContato confiabilidadeContato){
        final ConfiabilidadeContato confiabilidadeContatoCriado = contatoService.addConfiabilidade(confiabilidadeContato);
        return new ResponseEntity<ConfiabilidadeContato>(confiabilidadeContatoCriado, HttpStatus.CREATED);
    }
    @PostMapping(value = "recompensa", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Recompensa> addRecompensa(@RequestBody final Recompensa recompensa){
        final Recompensa recompensaCriada = contatoService.addRecompensa(recompensa);
        return new ResponseEntity<Recompensa>(recompensa, HttpStatus.CREATED);
    }

}
