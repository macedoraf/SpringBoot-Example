package br.com.applyer.v2.perfil.entity;

import javax.persistence.*;

@Entity
@Table(name = "SYS_APPLY_TB_IDIO")
public class Idioma {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "IDIO_ID")
    private long id;
    private String idioma;
    private String fala;
    private String leitura;
    private String escrita;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFala() {
        return fala;
    }

    public void setFala(String fala) {
        this.fala = fala;
    }

    public String getLeitura() {
        return leitura;
    }

    public void setLeitura(String leitura) {
        this.leitura = leitura;
    }

    public String getEscrita() {
        return escrita;
    }

    public void setEscrita(String escrita) {
        this.escrita = escrita;
    }
}
