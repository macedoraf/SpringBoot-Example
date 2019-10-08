package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.Usuario;
import br.com.applyer.v2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseService<Usuario> implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public CrudRepository<Usuario, Long> getRepository() {
        return repository;
    }


    @Override
    public Usuario authenticarUsuario(String email, String senha) {
        Usuario usuario = new Usuario();
        repository.findAll().forEach(
                it ->{
                    if(it.getEmail().equals(email) && it.getSenha().equals(senha)){
                       usuario.setId(it.getId());
                       usuario.setPerfil(it.getPerfil());
                       usuario.setNome(it.getNome());
                       usuario.setSobrenome(it.getSobrenome());
                       usuario.setEmail(it.getEmail());
                       usuario.setSenha(it.getSenha());
                    }
                }
        );
        return usuario;
    }

    @Override
    public Boolean cadastrarUsuario(Usuario usuario) {
        StringBuilder usuarioCadastradoString = new StringBuilder();
        repository.findAll()
                .forEach(
                        it ->{
                            if(it.getEmail().equals(usuario.getEmail()));{
                                usuarioCadastradoString.append("Cadastrado");
                            }
                        }
                );
        if(usuarioCadastradoString.toString().isEmpty()){
            repository.save(usuario);
        }

        return usuarioCadastradoString.toString().isEmpty();
    }
}
