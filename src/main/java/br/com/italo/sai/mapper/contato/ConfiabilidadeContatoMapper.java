package br.com.italo.sai.mapper.contato;


import br.com.italo.sai.bean.contato.ConfiabilidadeContatoBean;
import br.com.italo.sai.persistence.entity.contato.ConfiabilidadeContato;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConfiabilidadeContatoMapper {

    ConfiabilidadeContatoBean toBean(final ConfiabilidadeContato confiabilidadeContato);
}
