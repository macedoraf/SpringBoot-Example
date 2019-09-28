package br.com.applyer.v2.autenticacao.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * UsuarioCadastroRequest
 */
public class UsuarioCadastroRequest {
    @Min(4) @Max(32)
    private String email;
    @Min(4) @Max(32)
    private String nome;
    @Min(4) @Max(32)
    private String sobrenome;
    @Min(6) @Max(16)
    private String senha;


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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
