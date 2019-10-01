package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.USUARIO;
import br.com.applyer.v2.repository.JPA_USUARIO_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class JPA_USUARIO_ServiceImpl extends BaseService<USUARIO> implements JPA_USUARIO_Service {

    @Autowired
    private JPA_USUARIO_Repository repository;

    @Override
    public CrudRepository<USUARIO, Long> getRepository() {
        return repository;
    }
}
