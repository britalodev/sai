package br.com.italo.sai.bean.objetivo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ColetaBean {

    private String coleta;

}
