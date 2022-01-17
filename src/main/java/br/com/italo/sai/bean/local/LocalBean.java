package br.com.italo.sai.bean.local;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LocalBean {

    private TipoTerrenoBean tipoTerreno;

    private LocalEspecificoBean localEspecifico;

    private AgrupamentoPopulacionalBean agrupamentoPopulacional;

    private InimigosBean inimigos;


}
