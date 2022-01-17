package br.com.italo.sai.service.objetivo;

import br.com.italo.sai.bean.objetivo.ObjetivoBean;
import br.com.italo.sai.mapper.objetivo.ColetaMapper;
import br.com.italo.sai.mapper.objetivo.InimigoASerMortoMapper;
import br.com.italo.sai.mapper.objetivo.ItemMapper;
import br.com.italo.sai.mapper.objetivo.TipoDeMissaoMapper;
import br.com.italo.sai.persistence.entity.objetivo.Coleta;
import br.com.italo.sai.persistence.entity.objetivo.InimigoASerMorto;
import br.com.italo.sai.persistence.entity.objetivo.Item;
import br.com.italo.sai.persistence.entity.objetivo.TipoDeMissao;
import br.com.italo.sai.persistence.repository.objetivo.ColetaRepository;
import br.com.italo.sai.persistence.repository.objetivo.InimigoASerMortoRepository;
import br.com.italo.sai.persistence.repository.objetivo.ItemRepository;
import br.com.italo.sai.persistence.repository.objetivo.TipoDeMissaoRepository;
import br.com.italo.sai.util.RandomId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static br.com.italo.sai.util.CheckPresentUtil.checkPresentAndGet;

@Service
public class ObjetivoService {

    @Autowired
    private TipoDeMissaoRepository tipoDeMissaoRepository;
    @Autowired
    private ColetaRepository coletaRepository;
    @Autowired
    private InimigoASerMortoRepository inimigoASerMortoRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private TipoDeMissaoMapper tipoDeMissaoMapper;
    @Autowired
    private InimigoASerMortoMapper inimigoASerMortoMapper;
    @Autowired
    private ColetaMapper coletaMapper;
    @Autowired
    private ItemMapper itemMapper;

    public ObjetivoBean gerarObjetivo() {

        final Optional<TipoDeMissao> tipoDeMissaoOptional = tipoDeMissaoRepository.findById(RandomId.randomId(tipoDeMissaoRepository.count()));

        if(tipoDeMissaoOptional.isPresent()) {

            final TipoDeMissao tipoDeMissao = tipoDeMissaoOptional.get();

            ObjetivoBean objetivoBean = ObjetivoBean.builder()
                    .tipoDeMissao(tipoDeMissaoMapper.toBean(tipoDeMissao)).build();


            if (tipoDeMissao.isMatar() || tipoDeMissao.isCacada()) {
                final Optional<InimigoASerMorto> inimigoASerMorto = inimigoASerMortoRepository.findById(RandomId.randomId(inimigoASerMortoRepository.count()));
                objetivoBean = objetivoBean.toBuilder().inimigoASerMorto(inimigoASerMortoMapper.toBean(checkPresentAndGet(inimigoASerMorto))).build();
                return objetivoBean;
            }
            if (tipoDeMissao.isColeta()) {
                final Optional<Coleta> coleta = coletaRepository.findById(RandomId.randomId(coletaRepository.count()));
                objetivoBean = objetivoBean.toBuilder().coleta(coletaMapper.toBean(checkPresentAndGet(coleta))).build();
                return objetivoBean;
            }
            if (tipoDeMissao.isEscolta()) {
                final Optional<Item> item = itemRepository.findById(RandomId.randomId(itemRepository.count()));
                final Optional<InimigoASerMorto> inimigoASerMorto = inimigoASerMortoRepository.findById(RandomId.randomId(inimigoASerMortoRepository.count()));
                objetivoBean = objetivoBean.toBuilder().item(itemMapper.toBean(checkPresentAndGet(item)))
                        .inimigoASerMorto(inimigoASerMortoMapper.toBean(checkPresentAndGet(inimigoASerMorto))).build();
                return objetivoBean;
            }

            return objetivoBean;

        }
        return null;
    }

    public Coleta addColeta(final Coleta coleta) {
        return coletaRepository.save(coleta);

    }

    public Item addLocalEspecifico(final Item item) {
        return itemRepository.save(item);
    }

    public InimigoASerMorto addInimigo(final InimigoASerMorto inimigos) {
        return inimigoASerMortoRepository.save(inimigos);
    }

    public TipoDeMissao addTipoDeMissao(final TipoDeMissao tipoDeMissao) {
        return tipoDeMissaoRepository.save(tipoDeMissao);
    }
}
