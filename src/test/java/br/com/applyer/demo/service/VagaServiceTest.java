package br.com.applyer.demo.service;

import br.com.applyer.v2.service.VagaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static br.com.applyer.demo.Mocks.getMockedVaga;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VagaServiceTest {

    @Autowired
    private VagaService vagaService;

    @Test
    public void salvar(){
        vagaService.salvar(getMockedVaga());
    }

    @Test
    public void atualizar(){
        Long id = vagaService.salvar(getMockedVaga()).getId();
        vagaService.atualizar(id,getMockedVaga());
    }

    @Test
    public void deletar(){
        Long id = vagaService.salvar(getMockedVaga()).getId();
        vagaService.deletar(id);
    }

    @Test
    public void buscarId(){
        Long id = vagaService.salvar(getMockedVaga()).getId();
        vagaService.buscaPeloId(id);
    }

    @Test
    public void listAll(){
        vagaService.salvar(getMockedVaga());
        vagaService.salvar(getMockedVaga());
        vagaService.salvar(getMockedVaga());
        vagaService.salvar(getMockedVaga());
        vagaService.listarTodos();
    }

}
