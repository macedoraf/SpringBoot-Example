package br.com.applyer.v2.autenticacao.repository;

import br.com.applyer.v2.autenticacao.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;


/**
 * UsuarioRepository
 */
@Transactional
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

    
}