package com.example.start.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Cliente {

    @SerializedName("idCliente")
    @Expose
    private int idCliente;

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

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("senha")
    @Expose
    private String senha;

    @SerializedName("idCidade")
    @Expose
    private String cidade;

    @SerializedName("rua")
    @Expose
    private String endereco;

    @SerializedName("cep")
    @Expose
    private String cep;

    @SerializedName("numero")
    @Expose
    private int numero;

    @SerializedName("complemento")
    @Expose
    private String complemento;

    @SerializedName("bairo")
    @Expose
    private String bairro;

    @SerializedName("estado")
    @Expose
    private String estado;


    public Cliente() {
    }

    public Cliente(int idCliente,
                   String nomeCompleto,
                   Date dataNascimento,
                   String telefoneCelular,
                   String cpf_cnpj,
                   String cep,
                   String endereco,
                   int numero,
                   String complemento,
                   String bairro,
                   String cidade,
                   String estado,
                   String email,
                   String senha) {
        this.idCliente = idCliente;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.telefoneCelular = telefoneCelular;
        this.cpf_cnpj = cpf_cnpj;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.senha = senha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public void setDataNascimento(String dataNascimento) {
    }
}
