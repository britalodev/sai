package br.com.italo.sai.persistence.repository.subquest;

import br.com.italo.sai.persistence.entity.subquest.SubQuest;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubQuestRepository extends JpaRepository<SubQuest, Long> {
}
