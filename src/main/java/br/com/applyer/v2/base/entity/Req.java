package br.com.applyer.v2.base.entity;

import javax.persistence.*;

/**
 * @author Rafael
 */
@Entity
@Table(name = "APP_TB_REQUISITO")
public class Req {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String descricao;

    @Basic
    private String nivel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}