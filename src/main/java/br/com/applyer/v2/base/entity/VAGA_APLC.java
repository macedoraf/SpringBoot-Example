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
public class VAGA_APLC {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String status;

    @OneToOne
    private VAGA VAGA;

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

    public VAGA getVAGA() {
        return VAGA;
    }

    public void setVAGA(VAGA VAGA) {
        this.VAGA = VAGA;
    }

}