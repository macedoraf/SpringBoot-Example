package br.com.applyer.v2.autenticacao.entity;

import javax.persistence.*;

@Entity
@Table(name = "SYS_APPLY_TB_USUARIO")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USUARIO_ID")
    private Long id;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SENHA")
    private String senha;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "SOBRENOME")
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
 * @return the email
 */
public String getEmail() {
    return email;
}
/**
 * @return the id
 */
public Long getId() {
    return id;
}
/**
 * @return the senha
 */
public String getSenha() {
    return senha;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
    this.email = email;
}
/**
 * @param senha the senha to set
 */
public void setSenha(String senha) {
    this.senha = senha;
}

/**
 * @param id the id to set
 */
public void setId(Long id) {
    this.id = id;
}



}