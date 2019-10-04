package br.com.applyer.v2.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.Formacao;
import br.com.applyer.v2.service.FormacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("v3/formacao")
public class FormacaoController extends BaseController<Formacao> {

    @Autowired
    private FormacaoService service;

    @Override
    public BaseServiceContract<Formacao> getService() {
        return service;
    }
}
