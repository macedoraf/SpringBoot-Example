package br.com.applyer.v2.controller;


import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.USUARIO;
import br.com.applyer.v2.service.JPA_USUARIO_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "v3/usuario")
public class UsuarioController extends BaseController<USUARIO> {

    @Autowired
    private JPA_USUARIO_Service service;

    @Override
    public BaseServiceContract<USUARIO> getService() {
        return service;
    }
}
