package br.com.applyer.v2.base.entity;

import javax.persistence.*;

/**
 * @author Rafael
 */
@Entity
@Table(name = "APP_TB_PAIS")
public class Pais {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String pais;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}