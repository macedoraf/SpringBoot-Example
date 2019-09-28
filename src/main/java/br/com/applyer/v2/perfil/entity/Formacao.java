package br.com.applyer.v2.perfil.entity;

import javax.persistence.*;

@Entity
@Table(name = "SYS_APPLY_TB_FORMA")
public class Formacao {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "FORMA_ID")
    private long id;
    private String dataInicio;
    private String dataTermino;
    private String nomeInstituicao;
    private String tipoInstituicao;
    private String graduacao;
    private String curso;
    private String media;
    private String emCurso;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getTipoInstituicao() {
        return tipoInstituicao;
    }

    public void setTipoInstituicao(String tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getEmCurso() {
        return emCurso;
    }

    public void setEmCurso(String emCurso) {
        this.emCurso = emCurso;
    }
}
