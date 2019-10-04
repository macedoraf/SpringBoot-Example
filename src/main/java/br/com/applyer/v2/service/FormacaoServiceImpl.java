package br.com.applyer.v2.service;

import br.com.applyer.v2.base.BaseService;
import br.com.applyer.v2.base.entity.Formacao;
import br.com.applyer.v2.repository.FormacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class FormacaoServiceImpl extends BaseService<Formacao> implements FormacaoService {

    @Autowired
    private FormacaoRepository repository;

    @Override
    public CrudRepository<Formacao, Long> getRepository() {
        return repository;
    }
}
