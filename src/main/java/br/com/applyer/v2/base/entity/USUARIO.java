package br.com.applyer.v2.base.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author Rafael
 */
@Entity
public class USUARIO {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String email;

    @Basic
    private String senha;

    @Basic
    private String nome;

    @Basic
    private String sobrenome;

    @OneToOne
    private PERFIL JPA_TB_PERFIL;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

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

    public PERFIL getJPA_TB_PERFIL() {
        return JPA_TB_PERFIL;
    }

    public void setJPA_TB_PERFIL(PERFIL JPA_TB_PERFIL) {
        this.JPA_TB_PERFIL = JPA_TB_PERFIL;
    }

}