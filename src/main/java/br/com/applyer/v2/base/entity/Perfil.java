package br.com.applyer.v2.base.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * @author Rafael
 */
@Entity
@Table(name = "APP_TB_PERFIL")
public class Perfil {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String nomeBayer;

    @Basic
    private String celular;

    @Basic
    private String empresaAtual;

    @Basic
    private String tituloEmpregoAtual;

    @Basic
    private String telResidencial;

    @Basic
    private String endereco;

    @Basic
    private String cep;

    @Basic
    private String cidade;

    @OneToOne(mappedBy = "perfil")
    private Usuario usuario;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "Id", insertable = true, updatable = true)
    private Pais Pais;

    @OneToMany
    private List<Emprego> Empregos;

    @OneToMany
    private List<Formacao> Formacoes;

    @OneToMany
    private List<Idioma> idiomas;

    @OneToMany
    private List<VagaAplicacao> vagasAplicadas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeBayer() {
        return nomeBayer;
    }

    public void setNomeBayer(String nomeBayer) {
        this.nomeBayer = nomeBayer;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmpresaAtual() {
        return empresaAtual;
    }

    public void setEmpresaAtual(String empresaAtual) {
        this.empresaAtual = empresaAtual;
    }

    public String getTituloEmpregoAtual() {
        return tituloEmpregoAtual;
    }

    public void setTituloEmpregoAtual(String tituloEmpregoAtual) {
        this.tituloEmpregoAtual = tituloEmpregoAtual;
    }

    public String getTelResidencial() {
        return telResidencial;
    }

    public void setTelResidencial(String telResidencial) {
        this.telResidencial = telResidencial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pais getPais() {
        return Pais;
    }

    public void setPais(Pais pais) {
        this.Pais = pais;
    }

    public List<Emprego> getEmpregos() {
        if (Empregos == null) {
            Empregos = new ArrayList<>();
        }
        return Empregos;
    }

    public void setEmpregos(List<Emprego> empregos) {
        this.Empregos = empregos;
    }

    public void addEmprego(Emprego emprego) {
        getEmpregos().add(emprego);
    }

    public void removeEmprego(Emprego emprego) {
        getEmpregos().remove(emprego);
    }

    public List<Formacao> getFormacoes() {
        if (Formacoes == null) {
            Formacoes = new ArrayList<>();
        }
        return Formacoes;
    }

    public void setFormacoes(List<Formacao> formacoes) {
        this.Formacoes = formacoes;
    }

    public void addFormacao(Formacao _TB_FORMACAo) {
        getFormacoes().add(_TB_FORMACAo);
    }

    public void removeformacao(Formacao _TB_FORMACAo) {
        getFormacoes().remove(_TB_FORMACAo);
    }

    public List<Idioma> getIdiomas() {
        if (idiomas == null) {
            idiomas = new ArrayList<>();
        }
        return idiomas;
    }

    public void setIdiomas(List<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public void addJPA_TB_IDIOMA(Idioma IDIOMA) {
        getIdiomas().add(IDIOMA);
    }

    public void removeJPA_TB_IDIOMA(Idioma IDIOMA) {
        getIdiomas().remove(IDIOMA);
    }

    public List<VagaAplicacao> getVagasAplicadas() {
        if (vagasAplicadas == null) {
            vagasAplicadas = new ArrayList<>();
        }
        return vagasAplicadas;
    }

    public void setVagasAplicadas(List<VagaAplicacao> vagasAplicadas) {
        this.vagasAplicadas = vagasAplicadas;
    }

    public void addVagaApp(VagaAplicacao VagaAplicacao) {
        getVagasAplicadas().add(VagaAplicacao);
    }

    public void removeVagaApp(VagaAplicacao VagaAplicacao) {
        getVagasAplicadas().remove(VagaAplicacao);
    }

    @Override
    public String toString() {
        return "PERFIL{" +
                "id=" + id +
                ", nomeBayer='" + nomeBayer + '\'' +
                ", celular='" + celular + '\'' +
                ", empresaAtual='" + empresaAtual + '\'' +
                ", tituloEmpregoAtual='" + tituloEmpregoAtual + '\'' +
                ", telResidencial='" + telResidencial + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", USUARIO=" + usuario +
                ", TB_PAIS=" + Pais +
                ", _TB_EMPREGos=" + Empregos +
                ", _TB_FORMACAos=" + Formacoes +
                ", IDIOMAS=" + idiomas +
                ", VAGA_APLCS=" + vagasAplicadas +
                '}';
    }
}