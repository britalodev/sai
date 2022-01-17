package br.com.italo.sai.persistence.repository.objetivo;

import br.com.italo.sai.persistence.entity.objetivo.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
