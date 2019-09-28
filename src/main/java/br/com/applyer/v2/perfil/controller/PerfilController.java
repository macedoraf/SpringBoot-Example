package br.com.applyer.v2.perfil.controller;

import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.perfil.entity.Perfil;
import br.com.applyer.v2.perfil.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/perfil")
public class PerfilController extends BaseController<Perfil> {

    @Autowired
    PerfilService service;

    @Override
    public BaseServiceContract<Perfil> getService() {
        return service;
    }
}
