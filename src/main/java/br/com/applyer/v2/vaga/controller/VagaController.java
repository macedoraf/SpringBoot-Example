package br.com.applyer.v2.vaga.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.vaga.entity.Vaga;
import br.com.applyer.v2.vaga.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/vaga")
public class VagaController extends BaseController<Vaga> {

    @Autowired
    public VagaService service;


    @Override
    public BaseServiceContract<Vaga> getService() {
        return service;
    }
}
