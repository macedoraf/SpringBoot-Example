package br.com.applyer.v2.autenticacao.service;


import br.com.applyer.v2.autenticacao.entity.Usuario;
import br.com.applyer.v2.autenticacao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * UsuarioServiceImpl
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository repository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return repository.save(usuario);

    }

    @Override
    public Usuario buscarUsuario(long id) {
        return repository.findById(id).get();

    }

    @Override
    public Usuario autenticarUsuario(String email, String senha) {
        Usuario novoUsuario = new Usuario();
        repository.findAll().forEach(
                user -> {
                    if (user.getEmail().equals(email)
                            && user.getSenha().equals(senha)) {
                        novoUsuario.setEmail(email);
                        novoUsuario.setSenha(senha);
                        novoUsuario.setId(user.getId());
                    }
                }
        );
        return novoUsuario;
    }

    @Override
    public void deleteUsuario(long id) {
        repository.deleteById(id);

    }

    @Override
    public List<String> listarTodos() {
        List<String> list = new ArrayList<>();
        repository.findAll().forEach(it -> {
                    list.add(it.getEmail());
                }
        );
        return list;
    }


}