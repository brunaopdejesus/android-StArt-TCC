package com.example.start.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cidade {

    @SerializedName("idCidade")
    @Expose
    private int idCidade;

    @SerializedName("idEstado")
    @Expose
    private int idEstado;

    @SerializedName("nomeCidade")
    @Expose
    private String nomeCidade;

    public Cidade() {
    }

    public Cidade(int idCidade, int idEstado, String nomeCidade) {
        this.idCidade = idCidade;
        this.idEstado = idEstado;
        this.nomeCidade = nomeCidade;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}
