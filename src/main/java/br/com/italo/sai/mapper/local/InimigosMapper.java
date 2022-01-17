package br.com.italo.sai.mapper.local;

import br.com.italo.sai.bean.local.InimigosBean;
import br.com.italo.sai.persistence.entity.monstros.Inimigos;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InimigosMapper {

    InimigosBean toBean(final Inimigos inimigos);

}
