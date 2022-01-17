package br.com.italo.sai.rest.controller;


import br.com.italo.sai.persistence.entity.subquest.SubQuest;
import br.com.italo.sai.service.subquest.SubQuestService;
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
@RequestMapping(path = "subquest", produces = "application/json")
@Configuration
@CrossOrigin
public class SubQuestController {

    @Autowired
    private SubQuestService subQuestService;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SubQuest> addSubQuest(@RequestBody final SubQuest subQuest){
        final SubQuest subQuestCriada = subQuestService.addSubQuest(subQuest);
        return new ResponseEntity<SubQuest>(subQuestCriada, HttpStatus.CREATED);
    }

}
