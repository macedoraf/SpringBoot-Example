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
public class JPA_TB_VAGA {

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
    private List<TB_JPA_REQ> TB_JPA_REQs;

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

    public List<TB_JPA_REQ> getTB_JPA_REQs() {
        if (TB_JPA_REQs == null) {
            TB_JPA_REQs = new ArrayList<>();
        }
        return TB_JPA_REQs;
    }

    public void setTB_JPA_REQs(List<TB_JPA_REQ> TB_JPA_REQs) {
        this.TB_JPA_REQs = TB_JPA_REQs;
    }

    public void addTB_JPA_REQ(TB_JPA_REQ TB_JPA_REQ) {
        getTB_JPA_REQs().add(TB_JPA_REQ);
    }

    public void removeTB_JPA_REQ(TB_JPA_REQ TB_JPA_REQ) {
        getTB_JPA_REQs().remove(TB_JPA_REQ);
    }

}