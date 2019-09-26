package br.com.applyer.application.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.applyer.application.domain.Usuario;

/**
 * UsuarioRepository
 */
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

    
}