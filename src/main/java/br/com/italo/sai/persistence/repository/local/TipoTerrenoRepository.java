package br.com.italo.sai.persistence.repository.local;

import br.com.italo.sai.persistence.entity.local.TipoTerreno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoTerrenoRepository extends JpaRepository<TipoTerreno, Long> {
}
