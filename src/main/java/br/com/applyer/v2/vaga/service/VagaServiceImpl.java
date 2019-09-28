package br.com.applyer.v2.vaga.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.vaga.entity.Vaga;
import br.com.applyer.v2.vaga.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class VagaServiceImpl extends BaseService<Vaga> implements VagaService {


    private final VagaRepository repository;

    @Autowired
    public VagaServiceImpl(VagaRepository repository) {
        this.repository = repository;
    }

    @Override
    public CrudRepository<Vaga, Long> getRepository() {
        return repository;
    }
}
