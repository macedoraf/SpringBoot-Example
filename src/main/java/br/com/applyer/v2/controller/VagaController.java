package br.com.applyer.v2.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.Vaga;
import br.com.applyer.v2.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("v3/vaga")
public class VagaController extends BaseController<Vaga> {

    @Autowired
    private VagaService service;

    @Override
    public BaseServiceContract<Vaga> getService() {
        return service;
    }
}
