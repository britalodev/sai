package br.com.italo.sai.persistence.repository.objetivo;

import br.com.italo.sai.persistence.entity.local.TipoTerreno;
import br.com.italo.sai.persistence.entity.objetivo.Coleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColetaRepository extends JpaRepository<Coleta, Long> {
}
