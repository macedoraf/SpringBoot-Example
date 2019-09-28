package br.com.applyer.controller;

import br.com.applyer.request.CadastroPerfilRequest;
import br.com.applyer.response.CadastroPerfilResponse;
import br.com.applyer.service.UsuarioService;
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
public class PerfilController {



    @PostMapping("cadastro/perfil/{userId}")
    @CrossOrigin
    public ResponseEntity<CadastroPerfilResponse> cadastrarPerfil(@PathVariable("userId") String userId, @RequestBody CadastroPerfilRequest request, @Valid BindingResult result) {
        if (result.hasErrors()) {
            List<String> errorList = new ArrayList<>();
            result.getAllErrors().forEach(objectError -> errorList.add(objectError.getDefaultMessage()));
        }
        return ResponseEntity.ok(new CadastroPerfilResponse());
    }

    @GetMapping("consulta/perfil/{userId}")
    public ResponseEntity<CadastroPerfilResponse> consultaPerfilUsuario(@PathVariable("userId") String userId){
        CadastroPerfilResponse cadastroPerfilResponse = new CadastroPerfilResponse();
        cadastroPerfilResponse.setBayner("Bayner");
        cadastroPerfilResponse.setCelular("123");
        cadastroPerfilResponse.setDt_nasc("03/07/1996");
        cadastroPerfilResponse.setCidade("Osasco");
        return ResponseEntity.ok(cadastroPerfilResponse);
    }

}