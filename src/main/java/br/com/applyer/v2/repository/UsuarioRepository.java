package br.com.applyer.v2.repository;

import br.com.applyer.v2.base.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
