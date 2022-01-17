package br.com.italo.sai.bean.missao;

import br.com.italo.sai.bean.contato.ContatoBean;
import br.com.italo.sai.bean.local.LocalBean;
import br.com.italo.sai.bean.objetivo.ObjetivoBean;
import br.com.italo.sai.bean.subquest.SubQuestBean;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MissaoBean {

    LocalBean localBean;
    ContatoBean contatoBean;
    ObjetivoBean objetivoBean;
    SubQuestBean subQuestBean;

}
