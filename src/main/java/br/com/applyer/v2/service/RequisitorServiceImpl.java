package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.Req;
import br.com.applyer.v2.repository.RequisitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RequisitorServiceImpl extends BaseService<Req> implements RequisitorService {

    @Autowired
    private RequisitoRepository repository;
    @Override
    public CrudRepository<Req, Long> getRepository() {
        return repository;
    }
}
