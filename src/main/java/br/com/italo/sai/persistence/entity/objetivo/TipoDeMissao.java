package br.com.italo.sai.persistence.entity.objetivo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "tipo_missao")
public class TipoDeMissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoDeMissao;

    private boolean coleta;

    private boolean escolta;

    private boolean matar;

    private boolean cacada;

}
