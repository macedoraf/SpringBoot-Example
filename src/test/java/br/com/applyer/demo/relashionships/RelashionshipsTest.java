package br.com.applyer.demo.relashionships;

import br.com.applyer.v2.base.entity.Idioma;
import br.com.applyer.v2.base.entity.Pais;
import br.com.applyer.v2.service.IdiomaService;
import br.com.applyer.v2.service.PaisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static br.com.applyer.demo.Mocks.getMockedIdioma;
import static br.com.applyer.demo.Mocks.getMockedPais;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelashionshipsTest {

    @Autowired
    private PaisService paisService;
    @Autowired
    private IdiomaService idiomaService;

    @Test
    public void pais_Test(){
        Pais pais = paisService.salvar(getMockedPais());
        Idioma mockedIdioma = getMockedIdioma();
        mockedIdioma.setPais(pais);
        idiomaService.salvar(mockedIdioma);

    }
}
