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
public class PERFIL {

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
    private USUARIO USUARIO;

    @OneToOne
    private TB_PAIS TB_PAIS;

    @OneToMany
    private List<TB_EMPREGO> _TB_EMPREGos;

    @OneToMany
    private List<TB_FORMACAO> _TB_FORMACAos;

    @OneToMany
    private List<IDIOMA> IDIOMAS;

    @OneToMany
    private List<VAGA_APLC> VAGA_APLCS;

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

    public USUARIO getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(USUARIO USUARIO) {
        this.USUARIO = USUARIO;
    }

    public TB_PAIS getTB_PAIS() {
        return TB_PAIS;
    }

    public void setTB_PAIS(TB_PAIS TB_PAIS) {
        this.TB_PAIS = TB_PAIS;
    }

    public List<TB_EMPREGO> get_TB_EMPREGos() {
        if (_TB_EMPREGos == null) {
            _TB_EMPREGos = new ArrayList<>();
        }
        return _TB_EMPREGos;
    }

    public void set_TB_EMPREGos(List<TB_EMPREGO> _TB_EMPREGos) {
        this._TB_EMPREGos = _TB_EMPREGos;
    }

    public void addJPA_TB_EMPREGo(TB_EMPREGO _TB_EMPREGo) {
        get_TB_EMPREGos().add(_TB_EMPREGo);
    }

    public void removeJPA_TB_EMPREGo(TB_EMPREGO _TB_EMPREGo) {
        get_TB_EMPREGos().remove(_TB_EMPREGo);
    }

    public List<TB_FORMACAO> get_TB_FORMACAos() {
        if (_TB_FORMACAos == null) {
            _TB_FORMACAos = new ArrayList<>();
        }
        return _TB_FORMACAos;
    }

    public void set_TB_FORMACAos(List<TB_FORMACAO> _TB_FORMACAos) {
        this._TB_FORMACAos = _TB_FORMACAos;
    }

    public void addJPA_TB_FORMACAo(TB_FORMACAO _TB_FORMACAo) {
        get_TB_FORMACAos().add(_TB_FORMACAo);
    }

    public void removeJPA_TB_FORMACAo(TB_FORMACAO _TB_FORMACAo) {
        get_TB_FORMACAos().remove(_TB_FORMACAo);
    }

    public List<IDIOMA> getIDIOMAS() {
        if (IDIOMAS == null) {
            IDIOMAS = new ArrayList<>();
        }
        return IDIOMAS;
    }

    public void setIDIOMAS(List<IDIOMA> IDIOMAS) {
        this.IDIOMAS = IDIOMAS;
    }

    public void addJPA_TB_IDIOMA(IDIOMA IDIOMA) {
        getIDIOMAS().add(IDIOMA);
    }

    public void removeJPA_TB_IDIOMA(IDIOMA IDIOMA) {
        getIDIOMAS().remove(IDIOMA);
    }

    public List<VAGA_APLC> getVAGA_APLCS() {
        if (VAGA_APLCS == null) {
            VAGA_APLCS = new ArrayList<>();
        }
        return VAGA_APLCS;
    }

    public void setVAGA_APLCS(List<VAGA_APLC> VAGA_APLCS) {
        this.VAGA_APLCS = VAGA_APLCS;
    }

    public void addJPA_TB_VAGA_APLC(VAGA_APLC VAGA_APLC) {
        getVAGA_APLCS().add(VAGA_APLC);
    }

    public void removeJPA_TB_VAGA_APLC(VAGA_APLC VAGA_APLC) {
        getVAGA_APLCS().remove(VAGA_APLC);
    }

}