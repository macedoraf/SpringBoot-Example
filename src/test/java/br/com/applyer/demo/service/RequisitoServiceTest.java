package br.com.applyer.demo.service;

import br.com.applyer.v2.service.RequisitorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static br.com.applyer.demo.Mocks.getMockedReq;
import static br.com.applyer.demo.Mocks.getMockedVaga;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RequisitoServiceTest {

    @Autowired
    private RequisitorService service;

    @Test
    public void salvar(){
        service.salvar(getMockedReq());
    }

    @Test
    public void update(){
        Long id = service.salvar(getMockedReq()).getId();
        service.atualizar(id,getMockedReq());
    }

    @Test
    public void deletar(){
        Long id = service.salvar(getMockedReq()).getId();
        service.deletar(id);
    }

    @Test
    public void listar(){
        service.salvar(getMockedReq());
        service.salvar(getMockedReq());
        service.salvar(getMockedReq());

        service.listarTodos();
    }

    @Test
    public void buscarPorId(){
        Long id = service.salvar(getMockedReq()).getId();
        service.buscaPeloId(id);
    }
}
