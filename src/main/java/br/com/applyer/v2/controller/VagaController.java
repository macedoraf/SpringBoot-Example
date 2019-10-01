package br.com.applyer.v2.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.VAGA;
import br.com.applyer.v2.service.JPA_VAGA_Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("v3/vaga")
public class VagaController extends BaseController<VAGA> {
    private JPA_VAGA_Service service;

    @Override
    public BaseServiceContract<VAGA> getService() {
        return service;
    }
}
