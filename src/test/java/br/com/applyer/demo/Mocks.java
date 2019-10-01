package br.com.applyer.demo;

import br.com.applyer.v2.base.entity.*;

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

    public static Emprego getMockedEmprego(){
        Emprego emprego = new Emprego();
        emprego.setAreaFuncional(getRandomString());
        emprego.setCargo(getRandomString());
        emprego.setDataInicio(getRandomString());
        emprego.setDataTermino(getRandomString());
        emprego.setNomeEmpresa(getRandomString());
        emprego.setResponsabilidades(getRandomString());
        return emprego;
    }
    public static Pais getMockedPais(){
        Pais pais = new Pais();
        pais.setPais(getRandomString());
        return pais;
    }

    public static Idioma getMockedIdioma(){
        Idioma idioma = new Idioma();
        idioma.setEscrita(getRandomString());
        idioma.setFala(getRandomString());
        idioma.setLeitura(getRandomString());
        return idioma;
    }

    public static Vaga getMockedVaga(){
        Vaga vaga = new Vaga();
        vaga.setAreaSegmento(getRandomString());
        vaga.setCargo(getRandomString());
        vaga.setDescricao(getRandomString());
        return vaga;
    }

    public static Req getMockedReq(){
        Req req = new Req();
        req.setDescricao(getRandomString());
        req.setNivel(getRandomString());
        return req;
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
