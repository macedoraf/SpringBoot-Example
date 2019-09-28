package br.com.applyer.v2.perfil.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.perfil.entity.Perfil;
import br.com.applyer.v2.perfil.repository.PerfilRepository;
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
