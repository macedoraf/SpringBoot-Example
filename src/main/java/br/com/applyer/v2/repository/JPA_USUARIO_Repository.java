package br.com.applyer.v2.repository;

import br.com.applyer.v2.base.entity.USUARIO;
import org.springframework.data.repository.CrudRepository;

public interface JPA_USUARIO_Repository extends CrudRepository<USUARIO, Long> {
}
