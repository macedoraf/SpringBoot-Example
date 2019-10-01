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
public class JPA_TB_IDIOMA {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String leitura;

    @Basic
    private String fala;

    @Basic
    private String escrita;

    @OneToOne
    private JPA_TB_PAIS JPA_TB_PAIS;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeitura() {
        return leitura;
    }

    public void setLeitura(String leitura) {
        this.leitura = leitura;
    }

    public String getFala() {
        return fala;
    }

    public void setFala(String fala) {
        this.fala = fala;
    }

    public String getEscrita() {
        return escrita;
    }

    public void setEscrita(String escrita) {
        this.escrita = escrita;
    }

    public JPA_TB_PAIS getJPA_TB_PAIS() {
        return JPA_TB_PAIS;
    }

    public void setJPA_TB_PAIS(JPA_TB_PAIS JPA_TB_PAIS) {
        this.JPA_TB_PAIS = JPA_TB_PAIS;
    }

}