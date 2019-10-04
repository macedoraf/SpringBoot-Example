package br.com.applyer.v2.base.entity;

import javax.persistence.*;

/**
 * @author Rafael
 */
@Entity
@Table(name = "APP_TB_IDIOMA")
public class Idioma {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String leitura;

    @Basic
    private String fala;

    @Basic
    private String escrita;

    @OneToOne(cascade = CascadeType.ALL)
    private Pais Pais;

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

    public Pais getPais() {
        return Pais;
    }

    public void setPais(Pais pais) {
        this.Pais = pais;
    }

    @Override
    public String toString() {
        return "IDIOMA{" +
                "id=" + id +
                ", leitura='" + leitura + '\'' +
                ", fala='" + fala + '\'' +
                ", escrita='" + escrita + '\'' +
                ", TB_PAIS=" + Pais +
                '}';
    }
}