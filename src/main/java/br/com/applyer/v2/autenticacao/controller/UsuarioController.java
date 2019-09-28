package br.com.applyer.v2.autenticacao.controller;

import br.com.applyer.v2.autenticacao.entity.Usuario;
import br.com.applyer.v2.autenticacao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


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
    public ResponseEntity<UsuarioResponse> cadastrarUsuario(@RequestBody UsuarioCadastroRequest request, @Valid BindingResult result) {
        if (result.hasErrors()) {
            List<String> errorList = new ArrayList<>();
            result.getAllErrors().forEach(objectError -> errorList.add(objectError.getDefaultMessage()));
        }
        Usuario usuario = new Usuario();
        usuario.setEmail(request.getEmail());
        System.out.println("PRINT ---> EMAIL -> " + usuario.getEmail() + request.getEmail());
        usuario.setSenha(request.getSenha());
        usuario.setNome(request.getNome());
        usuario.setSobrenome(request.getSobrenome());
        service.cadastrarUsuario(usuario);
        return ResponseEntity.ok(new UsuarioResponse(usuario));
    }

    @PostMapping("login")
    @CrossOrigin
    public ResponseEntity<UsuarioResponse> autenticarUsuario(@RequestBody UsuarioAutenticaRequest request,@Valid  BindingResult result) {
        if (result.hasErrors()) {
            List<String> errorList = new ArrayList<>();
            result.getAllErrors().forEach(objectError -> errorList.add(objectError.getDefaultMessage()));
        }
        service.autenticarUsuario(request.getEmail(), request.getPassword());
        return ResponseEntity.ok(new UsuarioResponse());
    }

    @GetMapping("users")
    @CrossOrigin
    public ResponseEntity<List<String>> listaUsuarios() {
        return ResponseEntity.ok(service.listarTodos());
    }


}