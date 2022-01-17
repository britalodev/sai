package br.com.italo.sai.persistence.entity.monstros;


import br.com.italo.sai.persistence.entity.local.TipoTerreno;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity(name = "inimigos")
public class Inimigos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String inimigosNivel1;

    private String inimigosNivel2;

    @ManyToOne
    private TipoTerreno tipoTerreno;
}
