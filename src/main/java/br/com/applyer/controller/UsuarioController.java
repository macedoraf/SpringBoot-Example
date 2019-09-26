package br.com.applyer.application.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.applyer.application.domain.Usuario;
import br.com.applyer.application.requests.UsuarioAutenticaRequest;
import br.com.applyer.application.requests.UsuarioCadastroRequest;
import br.com.applyer.application.service.UsuarioService;

/**
 * UsuarioController
 */
@Controller
public class UsuarioController {

    private UsuarioService service;

    @Autowired
    public void setService(UsuarioService service) {
        this.service = service;
    }


    @PostMapping("cadastro/usuario")
    public String cadastrarUsuario(@Valid UsuarioCadastroRequest request){
        Usuario usuario = new Usuario();
        service.cadastrarUsuario(usuario);
        return "";
    }

    public String autenticarUsuario(@Valid UsuarioAutenticaRequest request){
        String email = "";
        String senha = "";
        service.autenticarUsuario(email, senha);
        return "";
    }

    
}