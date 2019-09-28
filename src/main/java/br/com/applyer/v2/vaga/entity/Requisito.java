package br.com.applyer.v2.vaga.entity;

import javax.persistence.*;

@Entity
@Table(name = "SYS_APPLY_TB_REQ")
public class Requisito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REQ_ID")
    private long id;
    private String nivel;
    private String tipo;

    public Requisito() {
    }

    public Requisito(long id, String nivel, String tipo) {
        this.id = id;
        this.nivel = nivel;
        this.tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Requisito{" +
                "id=" + id +
                ", nivel='" + nivel + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
