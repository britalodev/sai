package br.com.italo.sai.mapper.local;

import br.com.italo.sai.bean.local.AgrupamentoPopulacionalBean;
import br.com.italo.sai.persistence.entity.local.AgrupamentoPopulacional;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgrupamentoPopulacionalMapper {

    AgrupamentoPopulacionalBean toBean(final AgrupamentoPopulacional agrupamentoPopulacional);

}
