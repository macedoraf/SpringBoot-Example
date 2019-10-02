package br.com.applyer.v2.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.Pais;
import br.com.applyer.v2.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v3/pais")
public class PaisController extends BaseController<Pais> {

    @Autowired
    private PaisService service;

    @Override
    public BaseServiceContract<Pais> getService() {
        return service;
    }
}
