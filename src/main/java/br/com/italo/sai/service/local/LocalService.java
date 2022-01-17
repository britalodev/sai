package br.com.italo.sai.service.local;

import br.com.italo.sai.bean.local.LocalBean;
import br.com.italo.sai.mapper.local.AgrupamentoPopulacionalMapper;
import br.com.italo.sai.mapper.local.InimigosMapper;
import br.com.italo.sai.mapper.local.LocalEspecificoMapper;
import br.com.italo.sai.mapper.local.TipoTerrenoMapper;
import br.com.italo.sai.persistence.entity.local.AgrupamentoPopulacional;
import br.com.italo.sai.persistence.entity.local.LocalEspecifico;
import br.com.italo.sai.persistence.entity.local.TipoTerreno;
import br.com.italo.sai.persistence.entity.monstros.Inimigos;
import br.com.italo.sai.persistence.repository.local.AgrupamentoPopulacionalRepository;
import br.com.italo.sai.persistence.repository.local.LocalEspecificoRepository;
import br.com.italo.sai.persistence.repository.local.TipoTerrenoRepository;
import br.com.italo.sai.persistence.repository.monstros.InimigosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static br.com.italo.sai.util.CheckPresentUtil.checkPresentAndGet;
import static br.com.italo.sai.util.RandomId.randomId;
import static br.com.italo.sai.util.RandomId.randomIdWithZero;

@Service
public class LocalService {

    @Autowired
    private LocalEspecificoRepository localEspecificoRepository;
    @Autowired
    private TipoTerrenoRepository tipoTerrenoRepository;
    @Autowired
    private InimigosRepository inimigosRepository;
    @Autowired
    private AgrupamentoPopulacionalRepository agrupamentoPopulacionalRepository;
    @Autowired
    private LocalEspecificoMapper localEspecificoMapper;
    @Autowired
    private AgrupamentoPopulacionalMapper agrupamentoPopulacionalMapper;
    @Autowired
    private InimigosMapper inimigosMapper;
    @Autowired
    private TipoTerrenoMapper tipoTerrenoMapper;

    public LocalService() {
    }

    public LocalBean gerarLocal() {

        final List<Inimigos> allByTipoTerreno;


        final Optional<TipoTerreno> tipoTerreno = tipoTerrenoRepository.findById(randomId(tipoTerrenoRepository.count()));
        final Optional<LocalEspecifico> localEspecifico = localEspecificoRepository.findById(randomId(localEspecificoRepository.count()));
        final Inimigos inimigos = getInimigos(tipoTerreno);
        final Optional<AgrupamentoPopulacional> agrupamentoPopulacional = agrupamentoPopulacionalRepository.findById(randomId(agrupamentoPopulacionalRepository.count()));



        return LocalBean.builder().localEspecifico(localEspecificoMapper.toBean(checkPresentAndGet(localEspecifico)))
                .agrupamentoPopulacional(agrupamentoPopulacionalMapper.toBean(checkPresentAndGet(agrupamentoPopulacional)))
                .inimigos(inimigosMapper.toBean(inimigos))
                .tipoTerreno(tipoTerrenoMapper.toBean(checkPresentAndGet(tipoTerreno)))
                .build();
    }

    private Inimigos getInimigos(final Optional<TipoTerreno> tipoTerreno) {

        if(tipoTerreno.isPresent()) {
            final List<Inimigos> byTipoTerreno = inimigosRepository.findByTipoTerreno(tipoTerreno.get());
            final int size = byTipoTerreno.size();
            return size > 0 ? byTipoTerreno.get(randomIdWithZero(size)) : null;
        }
        return null;
    }

    public TipoTerreno addTipoTerreno(final TipoTerreno tipoTerreno) {
        return tipoTerrenoRepository.save(tipoTerreno);
    }

    public LocalEspecifico addLocalEspecifico(final LocalEspecifico localEspecifico) {
        return localEspecificoRepository.save(localEspecifico);
    }

    public AgrupamentoPopulacional addAgrupamentoPopulacional(final AgrupamentoPopulacional agrupamentoPopulacional) {
        return agrupamentoPopulacionalRepository.save(agrupamentoPopulacional);
    }

    public Inimigos addInimigo(final Inimigos inimigos) {
        return inimigosRepository.save(inimigos);
    }
}
