package br.com.applyer.v2.base.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Rafael
 */
@Entity
public class JPA_TB_PERFIL {

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

    @OneToOne(mappedBy = "JPA_TB_PERFIL")
    private JPA_TB_USUARIO JPA_TB_USUARIO;

    @OneToOne
    private JPA_TB_PAIS JPA_TB_PAIS;

    @OneToMany
    private List<JPA_TB_EMPREGO> JPA_TB_EMPREGoes;

    @OneToMany
    private List<JPA_TB_FORMACAO> JPA_TB_FORMACAos;

    @OneToMany
    private List<JPA_TB_IDIOMA> JPA_TB_IDIOMAs;

    @OneToMany
    private List<JPA_TB_VAGA_APLC> JPA_TB_VAGA_APLCs;

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

    public JPA_TB_USUARIO getJPA_TB_USUARIO() {
        return JPA_TB_USUARIO;
    }

    public void setJPA_TB_USUARIO(JPA_TB_USUARIO JPA_TB_USUARIO) {
        this.JPA_TB_USUARIO = JPA_TB_USUARIO;
    }

    public JPA_TB_PAIS getJPA_TB_PAIS() {
        return JPA_TB_PAIS;
    }

    public void setJPA_TB_PAIS(JPA_TB_PAIS JPA_TB_PAIS) {
        this.JPA_TB_PAIS = JPA_TB_PAIS;
    }

    public List<JPA_TB_EMPREGO> getJPA_TB_EMPREGoes() {
        if (JPA_TB_EMPREGoes == null) {
            JPA_TB_EMPREGoes = new ArrayList<>();
        }
        return JPA_TB_EMPREGoes;
    }

    public void setJPA_TB_EMPREGoes(List<JPA_TB_EMPREGO> JPA_TB_EMPREGoes) {
        this.JPA_TB_EMPREGoes = JPA_TB_EMPREGoes;
    }

    public void addJPA_TB_EMPREGo(JPA_TB_EMPREGO JPA_TB_EMPREGo) {
        getJPA_TB_EMPREGoes().add(JPA_TB_EMPREGo);
    }

    public void removeJPA_TB_EMPREGo(JPA_TB_EMPREGO JPA_TB_EMPREGo) {
        getJPA_TB_EMPREGoes().remove(JPA_TB_EMPREGo);
    }

    public List<JPA_TB_FORMACAO> getJPA_TB_FORMACAos() {
        if (JPA_TB_FORMACAos == null) {
            JPA_TB_FORMACAos = new ArrayList<>();
        }
        return JPA_TB_FORMACAos;
    }

    public void setJPA_TB_FORMACAos(List<JPA_TB_FORMACAO> JPA_TB_FORMACAos) {
        this.JPA_TB_FORMACAos = JPA_TB_FORMACAos;
    }

    public void addJPA_TB_FORMACAo(JPA_TB_FORMACAO JPA_TB_FORMACAo) {
        getJPA_TB_FORMACAos().add(JPA_TB_FORMACAo);
    }

    public void removeJPA_TB_FORMACAo(JPA_TB_FORMACAO JPA_TB_FORMACAo) {
        getJPA_TB_FORMACAos().remove(JPA_TB_FORMACAo);
    }

    public List<JPA_TB_IDIOMA> getJPA_TB_IDIOMAs() {
        if (JPA_TB_IDIOMAs == null) {
            JPA_TB_IDIOMAs = new ArrayList<>();
        }
        return JPA_TB_IDIOMAs;
    }

    public void setJPA_TB_IDIOMAs(List<JPA_TB_IDIOMA> JPA_TB_IDIOMAs) {
        this.JPA_TB_IDIOMAs = JPA_TB_IDIOMAs;
    }

    public void addJPA_TB_IDIOMA(JPA_TB_IDIOMA JPA_TB_IDIOMA) {
        getJPA_TB_IDIOMAs().add(JPA_TB_IDIOMA);
    }

    public void removeJPA_TB_IDIOMA(JPA_TB_IDIOMA JPA_TB_IDIOMA) {
        getJPA_TB_IDIOMAs().remove(JPA_TB_IDIOMA);
    }

    public List<JPA_TB_VAGA_APLC> getJPA_TB_VAGA_APLCs() {
        if (JPA_TB_VAGA_APLCs == null) {
            JPA_TB_VAGA_APLCs = new ArrayList<>();
        }
        return JPA_TB_VAGA_APLCs;
    }

    public void setJPA_TB_VAGA_APLCs(List<JPA_TB_VAGA_APLC> JPA_TB_VAGA_APLCs) {
        this.JPA_TB_VAGA_APLCs = JPA_TB_VAGA_APLCs;
    }

    public void addJPA_TB_VAGA_APLC(JPA_TB_VAGA_APLC JPA_TB_VAGA_APLC) {
        getJPA_TB_VAGA_APLCs().add(JPA_TB_VAGA_APLC);
    }

    public void removeJPA_TB_VAGA_APLC(JPA_TB_VAGA_APLC JPA_TB_VAGA_APLC) {
        getJPA_TB_VAGA_APLCs().remove(JPA_TB_VAGA_APLC);
    }

}