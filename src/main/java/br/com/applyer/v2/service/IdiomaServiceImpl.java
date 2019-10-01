package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.Idioma;
import br.com.applyer.v2.repository.IdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class IdiomaServiceImpl extends BaseService<Idioma> implements IdiomaService {
    @Autowired
    private IdiomaRepository repository;
    @Override
    public CrudRepository<Idioma, Long> getRepository() {
        return repository;
    }
}
