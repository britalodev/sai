package br.com.italo.sai.persistence.repository.contato;

import br.com.italo.sai.persistence.entity.contato.TipoDeContato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipodeContatoRepository extends JpaRepository<TipoDeContato, Long> {
}
