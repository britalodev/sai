package br.com.italo.sai.service.missao;

import br.com.italo.sai.bean.missao.MissaoBean;
import br.com.italo.sai.service.contato.ContatoService;
import br.com.italo.sai.service.local.LocalService;
import br.com.italo.sai.service.objetivo.ObjetivoService;
import br.com.italo.sai.service.subquest.SubQuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissaoService {

    @Autowired
    private LocalService localService;

    @Autowired
    private ContatoService contatoService;

    @Autowired
    private ObjetivoService objetivoService;

    @Autowired
    private SubQuestService subQuestService;

    @Autowired
    public MissaoBean gerarMissao() {
        return MissaoBean.builder()
                .localBean(localService.gerarLocal())
                .contatoBean(contatoService.gerarContato())
                .objetivoBean(objetivoService.gerarObjetivo())
                .subQuestBean(subQuestService.gerarSubQuest())
                .build();
    }


}
