package br.com.applyer.v2.controller;


import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.Usuario;
import br.com.applyer.v2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "v3/usuario")
public class UsuarioController extends BaseController<Usuario> {

    @Autowired
    private UsuarioService service;

    @Override
    public BaseServiceContract<Usuario> getService() {
        return service;
    }

}
