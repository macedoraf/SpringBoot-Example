package br.com.applyer.demo;

import br.com.applyer.v2.vaga.entity.Requisito;
import br.com.applyer.v2.vaga.entity.Vaga;
import br.com.applyer.v2.vaga.service.VagaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceVagasTest {

    @Autowired
    private VagaService vagaService;

    @Test
    public void salvarVaga_Test() {
        beginTestPrint("SALVAR VAGA");
        Vaga vaga = new Vaga(0, "Descricao", "Cargo", "Segmento", Arrays.asList(new Requisito(0, "Basico", "Avançado")));
        System.out.println(vagaService.salvar(vaga));
        endTestPrint();
    }

    @Test
    public void listarVaga_Test() {
        beginTestPrint("LISTAR VAGA");
        System.out.println(vagaService.listarTodos());
        endTestPrint();
    }

    @Test
    public void buscarPeloId_Test() {
    	beginTestPrint("BUSCAR PELO ID VAGA");
        System.out.println(vagaService.buscaPeloId(1));
        endTestPrint();
    }

    @Test
    public void atualizar_Test() {
    	beginTestPrint("ATUALIZAR VAGA");
        Vaga vaga = new Vaga(1, "ATUALIZADO", "ATUALIZADO", "Segmento", Arrays.asList(new Requisito(0, "ATUALIZADO", "ATUALIZADO")));
        System.out.println(vagaService.atualizar(vaga.getId(), vaga));
        endTestPrint();

    }

    private void beginTestPrint(String title) {
        System.out.println("######### " + title + " ##########");
    }

    private void endTestPrint() {
        System.out.println("######### END TEST ##########");
    }


}
