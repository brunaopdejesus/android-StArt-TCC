package com.example.start.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Artista {

    @SerializedName("idArtista")
    @Expose
    private int idArtista;

    @SerializedName("nomeCompleto")
    @Expose
    private String nomeCompleto;

    @SerializedName("dataNascimento")
    @Expose
    private Date dataNascimento;

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

    public Artista() {
    }

    public Artista(int idArtista,
                   String nomeCompleto,
                   Date dataNascimento,
                   String telefoneCelular,
                   String cpf_cnpj,
                   String pix,
                   String email,
                   String senha) {
        this.idArtista = idArtista;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.telefoneCelular = telefoneCelular;
        this.cpf_cnpj = cpf_cnpj;
        this.pix = pix;
        this.email = email;
        this.senha = senha;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
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
}