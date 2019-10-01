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
public class JPA_TB_EMPREGO {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String dataInicio;

    @Basic
    private String dataTermino;

    @Basic
    private String nomeEmpresa;

    @Basic
    private String cargo;

    @Basic
    private String areaFuncional;

    @Basic
    private String responsabilidades;

    @OneToOne
    private JPA_TB_PAIS JPA_TB_PAIS;

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

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAreaFuncional() {
        return areaFuncional;
    }

    public void setAreaFuncional(String areaFuncional) {
        this.areaFuncional = areaFuncional;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    public JPA_TB_PAIS getJPA_TB_PAIS() {
        return JPA_TB_PAIS;
    }

    public void setJPA_TB_PAIS(JPA_TB_PAIS JPA_TB_PAIS) {
        this.JPA_TB_PAIS = JPA_TB_PAIS;
    }

}