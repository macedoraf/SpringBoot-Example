package br.com.applyer.controller.requests;

/**
 * UsuarioCadastroRequest
 */
public class UsuarioCadastroRequest {
    private String email;
    private String nome;
    private String sobrenome;



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
