package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.Perfil;
import br.com.applyer.v2.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PerfilServiceImpl extends BaseService<Perfil> implements PerfilService {

    @Autowired
    private PerfilRepository repository;

    @Override
    public CrudRepository<Perfil, Long> getRepository() {
        return repository;
    }
}
