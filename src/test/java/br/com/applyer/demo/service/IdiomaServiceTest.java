package br.com.applyer.demo.service;

import br.com.applyer.v2.service.IdiomaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static br.com.applyer.demo.Mocks.getMockedIdioma;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IdiomaServiceTest {
    @Autowired
    private IdiomaService idiomaService;


    @Test
    public void cadastrar_idioma() {
        idiomaService.salvar(getMockedIdioma());
    }

    @Test
    public void atualizar_idioma() {
        Long id = idiomaService.salvar(getMockedIdioma()).getId();
        idiomaService.atualizar(id, getMockedIdioma());
    }

    @Test
    public void deletar_idioma(){
        Long id = idiomaService.salvar(getMockedIdioma()).getId();
        idiomaService.deletar(id);
    }

    @Test
    public void listar_idiomas(){
        idiomaService.salvar(getMockedIdioma());
        idiomaService.salvar(getMockedIdioma());
        idiomaService.salvar(getMockedIdioma());
        idiomaService.salvar(getMockedIdioma());
        idiomaService.listarTodos();
    }

    @Test
    public void buscarId_idioma(){
        Long id = idiomaService.salvar(getMockedIdioma()).getId();
        idiomaService.buscaPeloId(id);
    }


}
