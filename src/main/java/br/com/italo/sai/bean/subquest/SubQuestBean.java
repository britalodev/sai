package br.com.italo.sai.bean.subquest;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class SubQuestBean {

    private String subQuest;

}
