package br.com.applyer.demo;

import br.com.applyer.v2.base.entity.Perfil;
import br.com.applyer.v2.base.entity.Usuario;
import br.com.applyer.v2.service.PerfilService;
import br.com.applyer.v2.service.UsuarioService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

import static br.com.applyer.demo.Mocks.getMockedPerfil;
import static br.com.applyer.demo.Mocks.getMockedUsuario;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioServiceTest {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PerfilService perfilService;



    @Test
    public void cadastrarUsuario_SemPerfil() {
        Usuario usuario = getMockedUsuario();
        Usuario usuarioDoBanco = usuarioService.salvar(usuario);
        System.out.println("USUARIO ID = " + usuarioDoBanco.getId());

    }

    @Test
    public void cadastrarUsuario_Com_Perfil() {
        Perfil perfil = getMockedPerfil();
        Usuario mockedUsuario = getMockedUsuario();
        mockedUsuario.setPerfil(perfilService.salvar(perfil));
        usuarioService.salvar(mockedUsuario);
    }

    @Test
    public void adicionarPerfil_Ao_Usuario() {
        Usuario usuarioCadastrado = usuarioService.salvar(getMockedUsuario());
        Perfil perfilCadastrado = perfilService.salvar(getMockedPerfil());
        usuarioCadastrado.setPerfil(perfilCadastrado);
        usuarioService.atualizar(usuarioCadastrado.getId(), usuarioCadastrado);

    }

    @Test
    public void listar_Usuarios() {
        usuarioService.listarTodos();
    }

    @Test
    public void encontrar_pelo_id() {
        Long id = usuarioService.salvar(getMockedUsuario()).getId();
        usuarioService.buscaPeloId(id);
    }

    @Test
    public void deletarPerfil(){
        Long id = usuarioService.salvar(getMockedUsuario()).getId();
        usuarioService.deletar(id);
    }




}
