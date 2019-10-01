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
public class TB_FORMACAO {

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
    private TB_PAIS TB_PAIS;

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

    public TB_PAIS getTB_PAIS() {
        return TB_PAIS;
    }

    public void setTB_PAIS(TB_PAIS TB_PAIS) {
        this.TB_PAIS = TB_PAIS;
    }

}