package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.Pais;
import br.com.applyer.v2.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl extends BaseService<Pais> implements PaisService {
    @Autowired
    private PaisRepository repository;

    @Override
    public CrudRepository<Pais, Long> getRepository() {
        return repository;
    }
}
