package br.com.italo.sai.rest.controller;

import br.com.italo.sai.bean.missao.MissaoBean;
import br.com.italo.sai.service.missao.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "missao", produces = "application/json")
@Configuration
@CrossOrigin
public class MissaoController {

    @Autowired
    private MissaoService missaoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MissaoBean> gerarMissao(){
        final MissaoBean planet = missaoService.gerarMissao();
        return new ResponseEntity<MissaoBean>(planet, HttpStatus.CREATED);
    }

}
