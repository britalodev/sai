package br.com.italo.sai.mapper.subquest;

import br.com.italo.sai.bean.subquest.SubQuestBean;
import br.com.italo.sai.persistence.entity.subquest.SubQuest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubQuestMapper {

    SubQuestBean toBean(final SubQuest subQuest);

}
