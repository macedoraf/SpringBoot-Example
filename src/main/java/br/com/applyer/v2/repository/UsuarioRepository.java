package br.com.applyer.v2.repository;

import br.com.applyer.v2.base.entity.JPA_TB_USUARIO;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<JPA_TB_USUARIO, Long> {
}
