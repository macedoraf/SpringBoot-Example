package br.com.applyer.v2.controller;


import br.com.applyer.v2.base.BaseController;
import br.com.applyer.v2.base.BaseServiceContract;
import br.com.applyer.v2.base.entity.Usuario;
import br.com.applyer.v2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v3/auth")
public class UsuarioController extends BaseController<Usuario> {

    @Autowired
    private UsuarioService service;


    @PostMapping("/cadastrarUsuario")
    @CrossOrigin
    public ResponseEntity<String> cadastrarUsuario(@RequestBody Usuario entity) {
        if (service.cadastrarUsuario(entity)) {
            return ResponseEntity.ok("Usuário cadastrado com sucesso!");
        } else {
            return ResponseEntity.ok("Usuário ja existente ou inválido, por favor tente com outro e-mail");
        }


    }

    @PostMapping("/login")
    @CrossOrigin
    public ResponseEntity<Usuario> realizarLogin(@RequestBody Usuario entity) {
        return ResponseEntity.ok(service.authenticarUsuario(entity.getEmail(), entity.getSenha()));
    }


    @Override
    public BaseServiceContract<Usuario> getService() {
        return service;
    }

}
