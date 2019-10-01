package br.com.applyer.demo.service;

import br.com.applyer.v2.service.PaisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static br.com.applyer.demo.Mocks.getMockedPais;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaisServiceTest {

    @Autowired
    private PaisService service;

    @Test
    public void cadastrar() {
        service.salvar(getMockedPais());

    }

    @Test
    public void atualizar(){
        Long id = service.salvar(getMockedPais()).getId();
        service.atualizar(id,getMockedPais());
    }

    @Test
    public void deletar(){
        Long id = service.salvar(getMockedPais()).getId();
        service.deletar(id);
    }

    @Test
    public void listarTodos(){
        service.salvar(getMockedPais());
        service.salvar(getMockedPais());
        service.salvar(getMockedPais());
        service.salvar(getMockedPais());
        service.salvar(getMockedPais());

        service.listarTodos();
    }

    @Test
    public void buscarPorId(){
        Long id = service.salvar(getMockedPais()).getId();
        service.buscaPeloId(id);
    }

}
