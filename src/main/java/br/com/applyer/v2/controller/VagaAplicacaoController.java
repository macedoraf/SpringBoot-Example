package br.com.applyer.v2.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.VagaAplicacao;
import br.com.applyer.v2.service.VagaAplicacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("v3/aplicacao")
public class VagaAplicacaoController extends BaseController<VagaAplicacao> {

    @Autowired
    private VagaAplicacaoService service;
    @Override
    public BaseServiceContract<VagaAplicacao> getService() {
        return service;
    }
}
