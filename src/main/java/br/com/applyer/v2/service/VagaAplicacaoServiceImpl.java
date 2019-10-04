package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.VagaAplicacao;
import br.com.applyer.v2.repository.VagaAplicacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class VagaAplicacaoServiceImpl extends BaseService<VagaAplicacao> implements VagaAplicacaoService {
    @Autowired
    private VagaAplicacaoRepository repository;
    @Override
    public CrudRepository<VagaAplicacao, Long> getRepository() {
        return repository;
    }
}
