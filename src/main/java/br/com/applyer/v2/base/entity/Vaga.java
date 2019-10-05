package br.com.applyer.v2.base.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * @author Rafael
 */
@Entity
@Table(name = "APP_TB_VAGA")
public class Vaga {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String cargo;

    @Basic
    private String areaSegmento;

    @Basic
    private String descricao;

    @ManyToMany
    @JoinTable(name="vaga_requisito", joinColumns=
            {@JoinColumn(name="vaga_id")}, inverseJoinColumns=
            {@JoinColumn(name="req_id")})
    private List<Req> Reqs;

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

    public List<Req> getReqs() {
        if (Reqs == null) {
            Reqs = new ArrayList<>();
        }
        return Reqs;
    }

    public void setReqs(List<Req> reqs) {
        this.Reqs = reqs;
    }

    public void addTB_JPA_REQ(Req REQ) {
        getReqs().add(REQ);
    }

    public void removeTB_JPA_REQ(Req REQ) {
        getReqs().remove(REQ);
    }

}