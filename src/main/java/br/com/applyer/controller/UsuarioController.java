package br.com.applyer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import br.com.applyer.entity.Usuario;
import br.com.applyer.request.UsuarioAutenticaRequest;
import br.com.applyer.request.UsuarioCadastroRequest;
import br.com.applyer.response.UsuarioResponse;
import br.com.applyer.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * UsuarioController
 */
@Controller
@RequestMapping("/v1")
public class UsuarioController {

    @Autowired
    private UsuarioService service;



    @PostMapping("cadastro/usuario")
    @CrossOrigin
    public ResponseEntity<UsuarioResponse> cadastrarUsuario(@Valid UsuarioCadastroRequest request, BindingResult result){
        if(result.hasErrors()){
            List<String> errorList = new ArrayList<>();
            result.getAllErrors().forEach(objectError -> errorList.add(objectError.getDefaultMessage()));
        }
        Usuario usuario = new Usuario();
        service.cadastrarUsuario(usuario);
        return ResponseEntity.ok(new UsuarioResponse());
    }

    @PostMapping("login")
    @CrossOrigin
    public ResponseEntity<UsuarioResponse> autenticarUsuario(@Valid UsuarioAutenticaRequest request, BindingResult result){
        if(result.hasErrors()){
            List<String> errorList = new ArrayList<>();
            result.getAllErrors().forEach(objectError -> errorList.add(objectError.getDefaultMessage()));
        }
        service.autenticarUsuario(request.getEmail(), request.getPassword());
        return ResponseEntity.ok(new UsuarioResponse());
    }

    
}