package br.com.italo.sai.mapper.objetivo;

import br.com.italo.sai.bean.objetivo.ColetaBean;
import br.com.italo.sai.persistence.entity.objetivo.Coleta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ColetaMapper {

    ColetaBean toBean(final Coleta coleta);

}
