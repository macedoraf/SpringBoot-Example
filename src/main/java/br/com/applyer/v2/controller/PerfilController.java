package br.com.applyer.v2.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.Perfil;
import br.com.applyer.v2.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v3/perfil")
public class PerfilController extends BaseController<Perfil> {

    @Autowired
    private PerfilService service;
    @Override
    public BaseServiceContract<Perfil> getService() {
        return service;
    }
}
