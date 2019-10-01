package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.Emprego;
import br.com.applyer.v2.repository.EmpregoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpregoServiceImpl extends BaseService<Emprego> implements EmpregoService {

    @Autowired
    private EmpregoRepository repository;

    @Override
    public CrudRepository<Emprego, Long> getRepository() {
        return repository;
    }
}
