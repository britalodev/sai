package br.com.italo.sai.mapper.objetivo;

import br.com.italo.sai.bean.objetivo.ItemBean;
import br.com.italo.sai.persistence.entity.objetivo.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemBean toBean(final Item item);

}
