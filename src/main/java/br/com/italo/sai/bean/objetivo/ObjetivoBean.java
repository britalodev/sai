package br.com.italo.sai.bean.objetivo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ObjetivoBean {

    private ColetaBean coleta;
    private InimigoASerMortoBean inimigoASerMorto;
    private ItemBean item;
    private TipoDeMissaoBean tipoDeMissao;

}
