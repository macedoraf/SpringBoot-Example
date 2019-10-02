package br.com.applyer.v2.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.Idioma;
import br.com.applyer.v2.service.IdiomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v3/idioma")
public class IdiomaController extends BaseController<Idioma> {

    @Autowired
    private IdiomaService service;

    @Override
    public BaseServiceContract<Idioma> getService() {
        return service;
    }
}
