package br.com.applyer.v2.autenticacao.controller;

import br.com.applyer.v2.autenticacao.entity.Usuario;

/**
 * UsuarioResponse
 */
public class UsuarioResponse {
    private Long id;
    private String nome;
    private String sobrenome;

    public UsuarioResponse() {
    }
    public UsuarioResponse(Usuario usuario){
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.sobrenome = usuario.getSobrenome();
    }

    public UsuarioResponse(Long id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
}