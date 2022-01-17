package br.com.italo.sai.service.subquest;

import br.com.italo.sai.bean.subquest.SubQuestBean;
import br.com.italo.sai.mapper.subquest.SubQuestMapper;
import br.com.italo.sai.persistence.entity.subquest.SubQuest;
import br.com.italo.sai.persistence.repository.subquest.SubQuestRepository;
import br.com.italo.sai.util.RandomId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static br.com.italo.sai.util.CheckPresentUtil.checkPresentAndGet;

@Service
public class SubQuestService {

    @Autowired
    private SubQuestRepository subQuestRepository;

    @Autowired
    private SubQuestMapper subQuestMapper;

    public SubQuestBean gerarSubQuest() {
        final Optional<SubQuest> subQuest = subQuestRepository.findById(RandomId.randomId(subQuestRepository.count()));

        return subQuest.isPresent() ? subQuestMapper.toBean(checkPresentAndGet(subQuest)) : null;
    }

    public SubQuest addSubQuest(final SubQuest subQuest) {
        return subQuestRepository.save(subQuest);
    }
}
