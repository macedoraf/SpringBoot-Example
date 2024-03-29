package br.com.applyer.demo.service;

import br.com.applyer.v2.base.entity.Perfil;
import br.com.applyer.v2.service.EmpregoService;
import br.com.applyer.v2.service.PerfilService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static br.com.applyer.demo.Mocks.getMockedEmprego;
import static br.com.applyer.demo.Mocks.getMockedPerfil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PerfilServiceTest {

    @Autowired
    private PerfilService perfilService;

    @Autowired
    private EmpregoService empregoService;

    @Test
    public void cadastrar_OnSuccessTest() {
        Perfil perfil = new Perfil();
        perfil.setNomeBayer("Nome Bayner");
        perfil.setCelular("11999999");
        perfil.setCep("0000000");
        perfil.setCidade("SP");
        perfil.setTelResidencial("11111111");
        perfil.setTituloEmpregoAtual("Analista");
        perfilService.salvar(perfil);
    }

    @Test
    public void adiciona_Emprego_anterior(){
        Perfil perfil = perfilService.salvar(getMockedPerfil());
        perfil.addEmprego(empregoService.salvar(getMockedEmprego()));
        perfilService.atualizar(perfil.getId(),perfil);

    }



    @Test
    public void atualizar_perfil() {
        Long id = perfilService.salvar(getMockedPerfil()).getId();
        perfilService.atualizar(id, getMockedPerfil());

    }

    @Test
    public void deletar_perfil() {
        Long id = perfilService.salvar(getMockedPerfil()).getId();
        perfilService.deletar(id);
    }

    @Test
    public void listar_todos_perfil() {
        perfilService.listarTodos();
    }

    @Test
    public void encontrar_perfil_pelo_id() {
        Long id = perfilService.salvar(getMockedPerfil()).getId();
        perfilService.buscaPeloId(id);
    }


}
