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
}
