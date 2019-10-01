package br.com.applyer.demo;

import br.com.applyer.v2.base.entity.PERFIL;
import br.com.applyer.v2.base.entity.USUARIO;
import br.com.applyer.v2.base.entity.VAGA;
import br.com.applyer.v2.service.JPA_PERFIL_Service;
import br.com.applyer.v2.service.JPA_USUARIO_Service;
import br.com.applyer.v2.service.JPA_VAGA_Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TesteCRUD {

    @Autowired
    private JPA_PERFIL_Service perfilService;
    @Autowired
    private JPA_VAGA_Service vaga_service;
    @Autowired
    private JPA_USUARIO_Service usuario_service;

    @Test
    public void salvarTodos() {
        beginTestPrint("SALVAR USUARIO");
        USUARIO entity = new USUARIO();
        PERFIL perfil = new PERFIL();
        VAGA vaga = new VAGA();


        System.out.println(usuario_service.salvar(entity));
        endTestPrint();

        beginTestPrint("SALVAR PERFIL");
        System.out.println(perfilService.salvar(perfil));
        endTestPrint();

        beginTestPrint("SALVAR VAGA");

        System.out.println(vaga_service.salvar(vaga));
        endTestPrint();


    }


    private void beginTestPrint(String title) {
        System.out.println("######### " + title + " ##########");
    }

    private void endTestPrint() {
        System.out.println("######### END TEST ##########");
    }


}
