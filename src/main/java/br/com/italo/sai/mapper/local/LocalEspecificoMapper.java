package br.com.italo.sai.mapper.local;

import br.com.italo.sai.bean.local.LocalEspecificoBean;
import br.com.italo.sai.persistence.entity.local.LocalEspecifico;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocalEspecificoMapper {

    LocalEspecificoBean toBean(final LocalEspecifico localEspecifico);

}
