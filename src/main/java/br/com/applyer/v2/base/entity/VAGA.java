package br.com.applyer.v2.base.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Rafael
 */
@Entity
public class VAGA {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String cargo;

    @Basic
    private String areaSegmento;

    @Basic
    private String descricao;

    @OneToMany
    private List<REQ> REQS;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAreaSegmento() {
        return areaSegmento;
    }

    public void setAreaSegmento(String areaSegmento) {
        this.areaSegmento = areaSegmento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<REQ> getREQS() {
        if (REQS == null) {
            REQS = new ArrayList<>();
        }
        return REQS;
    }

    public void setREQS(List<REQ> REQS) {
        this.REQS = REQS;
    }

    public void addTB_JPA_REQ(REQ REQ) {
        getREQS().add(REQ);
    }

    public void removeTB_JPA_REQ(REQ REQ) {
        getREQS().remove(REQ);
    }

}