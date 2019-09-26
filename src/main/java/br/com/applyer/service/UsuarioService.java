package br.com.applyer.application.service;

import br.com.applyer.application.domain.Usuario;

/**
 * UsuarioService
 */
public interface UsuarioService {

public void cadastrarUsuario(Usuario usuario);

public Usuario buscarUsuario(long id);

public Usuario autenticarUsuario(String email, String senha);

public void deleteUsuario(long id);
    
}