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
public class IDIOMA {

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
    private TB_PAIS TB_PAIS;

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

    public TB_PAIS getTB_PAIS() {
        return TB_PAIS;
    }

    public void setTB_PAIS(TB_PAIS TB_PAIS) {
        this.TB_PAIS = TB_PAIS;
    }

}