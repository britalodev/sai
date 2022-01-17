package br.com.italo.sai.persistence.repository.monstros;

import br.com.italo.sai.persistence.entity.local.TipoTerreno;
import br.com.italo.sai.persistence.entity.monstros.Inimigos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InimigosRepository extends JpaRepository<Inimigos, Long> {
    List<Inimigos> findByTipoTerreno(TipoTerreno tipoTerreno);

}
