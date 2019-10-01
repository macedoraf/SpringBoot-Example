package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.PERFIL;
import br.com.applyer.v2.repository.JPA_PERFIL_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class JPA_PERFIL_ServiceImpl extends BaseService<PERFIL> implements JPA_PERFIL_Service {

    @Autowired
    private JPA_PERFIL_Repository repository;

    @Override
    public CrudRepository<PERFIL, Long> getRepository() {
        return repository;
    }
}
