package br.com.italo.sai.persistence.repository.local;

import br.com.italo.sai.persistence.entity.local.LocalEspecifico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalEspecificoRepository extends JpaRepository<LocalEspecifico, Long> {
}
