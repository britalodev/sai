package br.com.italo.sai.rest.controller;


import br.com.italo.sai.persistence.entity.local.AgrupamentoPopulacional;
import br.com.italo.sai.persistence.entity.local.LocalEspecifico;
import br.com.italo.sai.persistence.entity.local.TipoTerreno;
import br.com.italo.sai.persistence.entity.monstros.Inimigos;
import br.com.italo.sai.service.local.LocalService;
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
@RequestMapping(path = "local", produces = "application/json")
@Configuration
@CrossOrigin
public class LocalController {

    @Autowired
    private LocalService localService;



    @PostMapping(value = "tipo", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TipoTerreno> addTipoTerreno(@RequestBody final TipoTerreno tipoTerreno){
        final TipoTerreno tipoTerrenoCriado = localService.addTipoTerreno(tipoTerreno);
        return new ResponseEntity<TipoTerreno>(tipoTerrenoCriado, HttpStatus.CREATED);
    }
    @PostMapping(value = "localEspecifico", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LocalEspecifico> addLocalEspecifico(@RequestBody final LocalEspecifico localEspecifico){
        final LocalEspecifico localEspecificoCriado = localService.addLocalEspecifico(localEspecifico);
        return new ResponseEntity<LocalEspecifico>(localEspecificoCriado, HttpStatus.CREATED);
    }
    @PostMapping(value = "agrupamento", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AgrupamentoPopulacional> addAgrupamentoPopulacional(@RequestBody final AgrupamentoPopulacional agrupamentoPopulacional){
        final AgrupamentoPopulacional agrupamentoPopulacionalCriado = localService.addAgrupamentoPopulacional(agrupamentoPopulacional);
        return new ResponseEntity<AgrupamentoPopulacional>(agrupamentoPopulacionalCriado, HttpStatus.CREATED);
    }
    @PostMapping(value = "inimigos", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Inimigos> addInimigo(@RequestBody final Inimigos inimigos){
        final Inimigos inimigosCriado = localService.addInimigo(inimigos);
        return new ResponseEntity<Inimigos>(inimigosCriado, HttpStatus.CREATED);
    }

}
