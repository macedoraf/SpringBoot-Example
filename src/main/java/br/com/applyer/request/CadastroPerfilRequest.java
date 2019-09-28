package br.com.applyer.request;

public class CadastroPerfilRequest implements java.io.Serializable {
    private static final long serialVersionUID = -1554674466184167238L;
    private int estado_id;
    private String raca_id;
    private String telefone;
    private String cidade;
    private int pais_id;
    private int sexo_id;
    private String endereco;
    private String bayner;
    private String pref_idioma_id;
    private String prestador_type_id;
    private String cep;
    private String empresa_atual;
    private String titulo_emprego_atual;
    private String celular;
    private String dt_nasc;

    public int getEstado_id() {
        return this.estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }

    public String getRaca_id() {
        return this.raca_id;
    }

    public void setRaca_id(String raca_id) {
        this.raca_id = raca_id;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getPais_id() {
        return this.pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }

    public int getSexo_id() {
        return this.sexo_id;
    }

    public void setSexo_id(int sexo_id) {
        this.sexo_id = sexo_id;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBayner() {
        return this.bayner;
    }

    public void setBayner(String bayner) {
        this.bayner = bayner;
    }

    public String getPref_idioma_id() {
        return this.pref_idioma_id;
    }

    public void setPref_idioma_id(String pref_idioma_id) {
        this.pref_idioma_id = pref_idioma_id;
    }

    public String getPrestador_type_id() {
        return this.prestador_type_id;
    }

    public void setPrestador_type_id(String prestador_type_id) {
        this.prestador_type_id = prestador_type_id;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmpresa_atual() {
        return this.empresa_atual;
    }

    public void setEmpresa_atual(String empresa_atual) {
        this.empresa_atual = empresa_atual;
    }

    public String getTitulo_emprego_atual() {
        return this.titulo_emprego_atual;
    }

    public void setTitulo_emprego_atual(String titulo_emprego_atual) {
        this.titulo_emprego_atual = titulo_emprego_atual;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDt_nasc() {
        return this.dt_nasc;
    }

    public void setDt_nasc(String dt_nasc) {
        this.dt_nasc = dt_nasc;
    }
}
