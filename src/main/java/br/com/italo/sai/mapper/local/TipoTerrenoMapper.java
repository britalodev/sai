package br.com.italo.sai.mapper.local;

import br.com.italo.sai.bean.local.TipoTerrenoBean;
import br.com.italo.sai.persistence.entity.local.TipoTerreno;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoTerrenoMapper {

    TipoTerrenoBean toBean(final TipoTerreno tipoTerreno);

}
