package br.com.applyer.demo.controller;

import br.com.applyer.v2.controller.UsuarioController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioControllerTest {

    @Autowired
    private UsuarioController controller;

    @Test
    public void controllerIsNotNull_Test() {
        assertThat(controller).isNotNull();

    }
}
