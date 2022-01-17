package br.com.italo.sai.bean.contato;


import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ConfiabilidadeContatoBean {

    private String confiabilidadeContato;

}
