package br.com.applyer.v2.perfil.entity;

import br.com.applyer.v2.autenticacao.entity.Usuario;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "SYS_APPLY_TB_PERF")
@Table(name = "SYS_APPLY_TB_PERF")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERFIL_ID")
    private long id;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "USUARIO_ID")
    private Usuario usuario;

    @ManyToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    @JoinTable(joinColumns = {@JoinColumn(name = "EMPR_ID")})
    private List<Emprego> empregos = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(joinColumns = {@JoinColumn(name = "FORMA_ID")})
    private List<Formacao> formacoes = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(joinColumns = {@JoinColumn(name = "IDIO_ID")})
    private List<Idioma> idiomas = new ArrayList<>();


    private String tratamento;
    private String tituloAcademico;
    private String nomeBayer;
    private String tituloEmpregoAtual;
    private String telefoneResidencial;
    private String pais;
    private String prestadorDeServico;
    private String endereco;
    private String estado;
    private String idiomaPref;
    private String celular;
    private String cep;
    private String cidade;

    public List<Emprego> getEmpregos() {
        return empregos;
    }

    public void setEmpregos(List<Emprego> empregos) {
        this.empregos = empregos;
    }

    public List<Formacao> getFormacoes() {
        return formacoes;
    }

    public void setFormacoes(List<Formacao> formacoes) {
        this.formacoes = formacoes;
    }

    public List<Idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getPrestadorDeServico() {
        return prestadorDeServico;
    }

    public void setPrestadorDeServico(String prestadorDeServico) {
        this.prestadorDeServico = prestadorDeServico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public String getNomeBayer() {
        return nomeBayer;
    }

    public void setNomeBayer(String nomeBayer) {
        this.nomeBayer = nomeBayer;
    }

    public String getTituloEmpregoAtual() {
        return tituloEmpregoAtual;
    }

    public void setTituloEmpregoAtual(String tituloEmpregoAtual) {
        this.tituloEmpregoAtual = tituloEmpregoAtual;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPrestadorDeServiço() {
        return prestadorDeServico;
    }

    public void setPrestadorDeServiço(String prestadorDeServiço) {
        this.prestadorDeServico = prestadorDeServiço;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdiomaPref() {
        return idiomaPref;
    }

    public void setIdiomaPref(String idiomaPref) {
        this.idiomaPref = idiomaPref;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
