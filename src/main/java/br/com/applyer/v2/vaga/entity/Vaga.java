package br.com.applyer.v2.vaga.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "SYS_APPLY_TB_VAGA")
@Table(name = "SYS_APPLY_TB_VAGA")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VAGA_ID")
    private long id;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "CARGO")
    private String cargo;
    @Column(name = "SEGMENTO")
    private String segmento;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(joinColumns = {@JoinColumn(name = "VAGA_ID_REQ")},
            inverseJoinColumns = { @JoinColumn(name = "REQ_ID") })
    private List<Requisito> requisitos;


    public Vaga() {
        requisitos = new ArrayList<>();
    }

    public Vaga(long id, String descricao, String cargo, String segmento, List<Requisito> requisitos) {
        this.id = id;
        this.descricao = descricao;
        this.cargo = cargo;
        this.segmento = segmento;
        this.requisitos = requisitos;
    }

    public List<Requisito> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Requisito> requisitos) {
        this.requisitos = requisitos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", cargo='" + cargo + '\'' +
                ", segmento='" + segmento + '\'' +
                ", rqList=" + requisitos +
                '}';
    }
}

