package br.com.italo.sai.service.contato;

import br.com.italo.sai.bean.contato.ContatoBean;
import br.com.italo.sai.mapper.contato.ConfiabilidadeContatoMapper;
import br.com.italo.sai.mapper.contato.RecompensaMapper;
import br.com.italo.sai.mapper.contato.TipoDeContatoMapper;
import br.com.italo.sai.persistence.entity.contato.ConfiabilidadeContato;
import br.com.italo.sai.persistence.entity.contato.Recompensa;
import br.com.italo.sai.persistence.entity.contato.TipoDeContato;
import br.com.italo.sai.persistence.repository.contato.ConfiabilidadeContatoRepository;
import br.com.italo.sai.persistence.repository.contato.RecompensaRepository;
import br.com.italo.sai.persistence.repository.contato.TipodeContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static br.com.italo.sai.util.CheckPresentUtil.checkPresentAndGet;
import static br.com.italo.sai.util.RandomId.randomId;

@Service
public class ContatoService {

    @Autowired
    private ConfiabilidadeContatoRepository confiabilidadeContatoRepository;

    @Autowired
    private RecompensaRepository recompensaRepository;

    @Autowired
    private TipodeContatoRepository tipodeContatoRepository;

    @Autowired
    private ConfiabilidadeContatoMapper confiabilidadeContatoMapper;

    @Autowired
    private RecompensaMapper recompensaMapper;

    @Autowired
    private TipoDeContatoMapper tipoDeContatoMapper;


    public TipoDeContato addTipoDeContato(final TipoDeContato tipoDeContato) {
        return tipodeContatoRepository.save(tipoDeContato);
    }


    public Recompensa addRecompensa(final Recompensa recompensa) {
        return recompensaRepository.save(recompensa);
    }


    public ConfiabilidadeContato addConfiabilidade(final ConfiabilidadeContato confiabilidadeContato) {
        return confiabilidadeContatoRepository.save(confiabilidadeContato);
    }


    public ContatoBean gerarContato(){

    final Optional<ConfiabilidadeContato> confiabilidadeContato = confiabilidadeContatoRepository.findById(randomId(confiabilidadeContatoRepository.count()));
    final Optional<Recompensa> recompensa = recompensaRepository.findById(randomId(recompensaRepository.count()));
    final Optional<TipoDeContato> tipoDeContato = tipodeContatoRepository.findById(randomId(tipodeContatoRepository.count()));

    return ContatoBean.builder()
            .confiabilidadeContato(confiabilidadeContatoMapper.toBean(checkPresentAndGet(confiabilidadeContato)))
            .recompensa(recompensaMapper.toBean(checkPresentAndGet(recompensa)))
            .tipoDeContato(tipoDeContatoMapper.toBean(checkPresentAndGet(tipoDeContato)))
            .build();
    }

}
