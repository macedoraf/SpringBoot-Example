package br.com.applyer.v2.base.entity;

import javax.persistence.*;

/**
 * @author Rafael
 */
@Entity
@Table(name = "APP_TB_EMPREGO")
public class Emprego {

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

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "Id", insertable = true, updatable = true)
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

    public Pais getPais() {
        return Pais;
    }

    public void setPais(Pais pais) {
        this.Pais = pais;
    }

}