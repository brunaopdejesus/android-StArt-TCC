package com.example.start.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Artista {

    @SerializedName("idArtista")
    @Expose
    private int idArtista;

    @SerializedName("userType")
    @Expose
    private int userType;

    @SerializedName("nomeCompleto")
    @Expose
    private String nomeCompleto;

    @SerializedName("nomeArtistico")
    @Expose
    private String nomeArtistico;

    @SerializedName("dataNascimento")
    @Expose
    private String dataNascimento;

    @SerializedName("telefoneCelular")
    @Expose
    private String telefoneCelular;

    @SerializedName("cpf_cnpj")
    @Expose
    private String cpf_cnpj;

    @SerializedName("pix")
    @Expose
    private String pix;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("senha")
    @Expose
    private String senha;

    @SerializedName("contaEstaAtiva")
    @Expose
    private int contaEstaAtiva;

    @SerializedName("eDestacado")
    @Expose
    private int eDestacado;

    @SerializedName("idEspecialidadeArtista")
    @Expose
    private int idEspecialidadeArtista;

    @SerializedName("idEspecialidade")
    @Expose
    private int idEspecialidade;


    public Artista() {
    }

    public Artista(int idArtista,
                   String nomeCompleto,
                   String nomeArtistico,
                   Date dataNascimento,
                   String telefoneCelular,
                   String cpf_cnpj,
                   String pix,
                   String email,
                   String senha,
                   int contaEstaAtiva,
                   int eDestacado,
                   int idEspecialidadeArtista,
                   int idEspecialidade,
                   int userType) {
        this.idArtista = idArtista;
        this.nomeCompleto = nomeCompleto;
        this.nomeArtistico = nomeArtistico;
        this.dataNascimento = String.valueOf(dataNascimento);
        this.telefoneCelular = telefoneCelular;
        this.cpf_cnpj = cpf_cnpj;
        this.pix = pix;
        this.email = email;
        this.senha = senha;
        this.contaEstaAtiva = contaEstaAtiva;
        this.eDestacado = eDestacado;
        this.idEspecialidadeArtista = idEspecialidadeArtista;
        this.idEspecialidade = idEspecialidade;
        this.userType = userType;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getContaEstaAtiva() {
        return contaEstaAtiva;
    }

    public void setContaEstaAtiva(int contaEstaAtiva) {
        this.contaEstaAtiva = contaEstaAtiva;
    }

    public int geteDestacado() {
        return eDestacado;
    }

    public void seteDestacado(int eDestacado) {
        this.eDestacado = eDestacado;
    }

    public int getIdEspecialidadeArtista() {
        return idEspecialidadeArtista;
    }

    public void setIdEspecialidadeArtista(int idEspecialidadeArtista) {
        this.idEspecialidadeArtista = idEspecialidadeArtista;
    }

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
