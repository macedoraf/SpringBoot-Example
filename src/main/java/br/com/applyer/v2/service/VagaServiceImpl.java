package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.Vaga;
import br.com.applyer.v2.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class VagaServiceImpl extends BaseService<Vaga> implements VagaService {

    @Autowired
    private VagaRepository repository;

    @Override
    public CrudRepository<Vaga, Long> getRepository() {
        return repository;
    }
}
