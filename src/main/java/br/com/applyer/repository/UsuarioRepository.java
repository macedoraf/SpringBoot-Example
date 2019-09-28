package br.com.applyer.repository;

import br.com.applyer.entity.Usuario;
import org.springframework.data.repository.CrudRepository;


/**
 * UsuarioRepository
 */
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

    
}