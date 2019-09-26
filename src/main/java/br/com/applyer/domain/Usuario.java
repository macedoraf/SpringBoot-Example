package br.com.applyer.application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SYS_TB_USUARIO")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SENHA")
    private String senha;
    
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