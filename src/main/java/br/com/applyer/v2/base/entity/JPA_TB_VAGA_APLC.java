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
public class JPA_TB_VAGA_APLC {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String status;

    @OneToOne
    private JPA_TB_VAGA JPA_TB_VAGA;

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

    public JPA_TB_VAGA getJPA_TB_VAGA() {
        return JPA_TB_VAGA;
    }

    public void setJPA_TB_VAGA(JPA_TB_VAGA JPA_TB_VAGA) {
        this.JPA_TB_VAGA = JPA_TB_VAGA;
    }

}