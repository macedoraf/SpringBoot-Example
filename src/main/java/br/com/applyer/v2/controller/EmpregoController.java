package br.com.applyer.v2.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.Emprego;
import br.com.applyer.v2.service.EmpregoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v3/emprego")
public class EmpregoController extends BaseController<Emprego> {

    @Autowired
    private EmpregoService service;

    @Override
    public BaseServiceContract<Emprego> getService() {
        return service;
    }
}
