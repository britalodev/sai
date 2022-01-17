package br.com.italo.sai.persistence.entity.local;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "agrupamento_populacional")
public class AgrupamentoPopulacional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agrupamentoPopulacional;

}
