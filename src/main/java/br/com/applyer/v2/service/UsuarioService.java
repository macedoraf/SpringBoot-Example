package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService extends BaseServiceContract<Usuario> {

    Usuario authenticarUsuario(String email, String senha);

    Boolean cadastrarUsuario(Usuario usuario);
}
