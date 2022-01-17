package br.com.italo.sai.rest.controller;


import br.com.italo.sai.persistence.entity.objetivo.Coleta;
import br.com.italo.sai.persistence.entity.objetivo.InimigoASerMorto;
import br.com.italo.sai.persistence.entity.objetivo.Item;
import br.com.italo.sai.persistence.entity.objetivo.TipoDeMissao;
import br.com.italo.sai.service.objetivo.ObjetivoService;
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
@RequestMapping(path = "objetivo", produces = "application/json")
@Configuration
@CrossOrigin
public class ObjetivoController {

    @Autowired
    private ObjetivoService objetivoService;



    @PostMapping(value = "coleta", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Coleta> addColeta(@RequestBody final Coleta coleta){
        final Coleta coletaCriada = objetivoService.addColeta(coleta);
        return new ResponseEntity<Coleta>(coletaCriada, HttpStatus.CREATED);
    }
    @PostMapping(value = "item", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Item> addITem(@RequestBody final Item item){
        final Item itemCriado = objetivoService.addLocalEspecifico(item);
        return new ResponseEntity<Item>(itemCriado, HttpStatus.CREATED);
    }
    @PostMapping(value = "inimigo", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<InimigoASerMorto> addInimigo(@RequestBody final InimigoASerMorto inimigoASerMorto){
        final InimigoASerMorto inimigosCriado = objetivoService.addInimigo(inimigoASerMorto);
        return new ResponseEntity<InimigoASerMorto>(inimigosCriado, HttpStatus.CREATED);
    }
    @PostMapping(value = "tipo", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TipoDeMissao> addTipo(@RequestBody final TipoDeMissao tipoDeMissao){
        final TipoDeMissao tipoDeMissaoCriado = objetivoService.addTipoDeMissao(tipoDeMissao);
        return new ResponseEntity<TipoDeMissao>(tipoDeMissaoCriado, HttpStatus.CREATED);
    }

}
