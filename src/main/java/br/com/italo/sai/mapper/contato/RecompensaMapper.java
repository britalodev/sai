package br.com.italo.sai.mapper.contato;


import br.com.italo.sai.bean.contato.RecompensaBean;
import br.com.italo.sai.persistence.entity.contato.Recompensa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecompensaMapper {

    RecompensaBean toBean(final Recompensa recompensa);
}
