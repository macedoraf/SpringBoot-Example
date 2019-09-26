package br.com.applyer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.applyer.domain.Usuario;
import br.com.applyer.requests.UsuarioAutenticaRequest;
import br.com.applyer.requests.UsuarioCadastroRequest;
import br.com.applyer.service.UsuarioService;

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