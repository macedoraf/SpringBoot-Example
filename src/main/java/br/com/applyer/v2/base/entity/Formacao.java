package br.com.applyer.v2.base.entity;

import javax.persistence.*;

/**
 * @author Rafael
 */
@Entity
@Table(name = "APP_TB_FORMACAO")
public class Formacao {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String dataInicio;

    @Basic
    private String dataFim;

    @Basic
    private String nomeInstituicao;

    @Basic
    private String media;

    @OneToOne
    private Pais Pais;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public Pais getPais() {
        return Pais;
    }

    public void setPais(Pais pais) {
        this.Pais = pais;
    }

}