package br.com.italo.sai.mapper.objetivo;

import br.com.italo.sai.bean.objetivo.TipoDeMissaoBean;
import br.com.italo.sai.persistence.entity.objetivo.TipoDeMissao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoDeMissaoMapper {

    TipoDeMissaoBean toBean(final TipoDeMissao tipoDeMissao);

}
