package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.VAGA;
import br.com.applyer.v2.repository.JPA_VAGA_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class JPA_VAGA_ServiceImpl extends BaseService<VAGA> implements JPA_VAGA_Service {

    @Autowired
    private JPA_VAGA_Repository repository;

    @Override
    public CrudRepository<VAGA, Long> getRepository() {
        return repository;
    }
}
