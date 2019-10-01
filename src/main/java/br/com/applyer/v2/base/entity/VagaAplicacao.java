package br.com.applyer.v2.base.entity;

import javax.persistence.*;

/**
 * @author Rafael
 */
@Entity
@Table(name = "APP_TB_VAGA_APP")
public class VagaAplicacao {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String status;

    @OneToOne
    private Vaga VAGA;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Vaga getVAGA() {
        return VAGA;
    }

    public void setVAGA(Vaga VAGA) {
        this.VAGA = VAGA;
    }

}