package br.com.italo.sai.persistence.entity.contato;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "confiabilidade_contato")
public class ConfiabilidadeContato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String confiabilidadeContato;

}
