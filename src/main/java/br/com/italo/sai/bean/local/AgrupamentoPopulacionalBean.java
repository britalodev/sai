package br.com.italo.sai.bean.local;

import lombok.Builder;
import lombok.Data;


@Data
@Builder(toBuilder = true)
public class AgrupamentoPopulacionalBean {

    private String agrupamentoPopulacional;

}
