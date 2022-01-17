package br.com.italo.sai.mapper.objetivo;

import br.com.italo.sai.bean.objetivo.InimigoASerMortoBean;
import br.com.italo.sai.persistence.entity.objetivo.InimigoASerMorto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InimigoASerMortoMapper {

    InimigoASerMortoBean toBean(final InimigoASerMorto tipoDeMissao);

}
