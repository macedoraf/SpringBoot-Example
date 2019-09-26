package br.com.applyer.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.applyer.domain.Usuario;

/**
 * UsuarioRepository
 */
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

    
}