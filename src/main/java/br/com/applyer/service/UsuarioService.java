package br.com.applyer.service;


import br.com.applyer.entity.Usuario;

/**
 * UsuarioService
 */
public interface UsuarioService {

public void cadastrarUsuario(Usuario usuario);

public Usuario buscarUsuario(long id);

public Usuario autenticarUsuario(String email, String senha);

public void deleteUsuario(long id);
    
}