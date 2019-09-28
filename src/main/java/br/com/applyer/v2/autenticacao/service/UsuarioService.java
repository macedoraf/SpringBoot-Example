package br.com.applyer.v2.autenticacao.service;


import br.com.applyer.v2.autenticacao.entity.Usuario;

import java.util.List;

/**
 * UsuarioService
 */
public interface UsuarioService {

public Usuario cadastrarUsuario(Usuario usuario);

public Usuario buscarUsuario(long id);

public Usuario autenticarUsuario(String email, String senha);

public void deleteUsuario(long id);
public List<String> listarTodos();
    
}