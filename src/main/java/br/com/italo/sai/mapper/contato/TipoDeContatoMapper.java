package br.com.italo.sai.mapper.contato;


import br.com.italo.sai.bean.contato.TipoContatoBean;
import br.com.italo.sai.persistence.entity.contato.TipoDeContato;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoDeContatoMapper {

    TipoContatoBean toBean(final TipoDeContato tipoDeContato);
}
