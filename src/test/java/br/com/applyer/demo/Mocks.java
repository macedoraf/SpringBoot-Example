package br.com.applyer.demo;

import br.com.applyer.v2.base.entity.Perfil;
import br.com.applyer.v2.base.entity.Usuario;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Mocks {


    private static Random random = new Random(5);
    
    private static String getRandomString(){
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return new String(array, StandardCharsets.UTF_8);
    }

    public static Usuario getMockedUsuario() {
        Usuario usuario = new Usuario();
        usuario.setEmail(getRandomString());
        usuario.setNome(getRandomString());
        usuario.setSenha(getRandomString());
        usuario.setSobrenome(getRandomString());
        return usuario;
    }

    public static Perfil getMockedPerfil() {
        Perfil perfil = new Perfil();
        perfil.setNomeBayer(getRandomString());
        perfil.setEndereco(getRandomString());
        perfil.setCelular(getRandomString());
        perfil.setCep(getRandomString());
        perfil.setEmpresaAtual(getRandomString());
        perfil.setCidade(getRandomString());
        perfil.setTelResidencial(getRandomString());
        perfil.setTituloEmpregoAtual(getRandomString());
        return perfil;
    }
}
