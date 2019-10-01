package br.com.applyer.demo;

import br.com.applyer.v2.autenticacao.entity.Usuario;
import br.com.applyer.v2.perfil.entity.Emprego;
import br.com.applyer.v2.perfil.entity.Formacao;
import br.com.applyer.v2.perfil.entity.Idioma;
import br.com.applyer.v2.perfil.entity.Perfil;
import br.com.applyer.v2.perfil.service.PerfilService;
import br.com.applyer.v2.vaga.entity.Requisito;
import br.com.applyer.v2.vaga.entity.Vaga;
import br.com.applyer.v2.vaga.service.VagaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServicePerfilTest {

    @Autowired
    private PerfilService perfilService;

    @Test
    public void salvarPerfil_Test() {
        beginTestPrint("SALVAR PERFIL");
        Usuario usuario = new Usuario(0L,"email@teste.com","senhaTeste","Teste nome","Teste Sobrenome");
        List<Emprego> empregos = Arrays.asList(new Emprego(0L,"03/07/1996","03/08/1996",
                "Empresa Teste","Cargo Teste","TipoNegocio",
                "AreFuncional","Varias","Brasil"));
        List<Formacao> formacaos = Arrays.asList(new Formacao());
        List<Idioma> idiomas = Arrays.asList(new Idioma());
        Perfil perfil = new Perfil(0,usuario,empregos,formacaos,idiomas,"tratament","tituloAcademico","nomeBayer","tituloEmpregoAtual","11980841888","Brazil","Prestador","Rua das Ruas","SP",
                "idiomaPref","119999","0676223","SP");
        System.out.println(perfilService.salvar(perfil));

        endTestPrint();
    }



    private void beginTestPrint(String title) {
        System.out.println("######### " + title + " ##########");
    }

    private void endTestPrint() {
        System.out.println("######### END TEST ##########");
    }


}
