package com.example.start.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Obra {

    @SerializedName("idObra")
    @Expose
    private int idObra;

    @SerializedName("nomeObra")
    @Expose
    private String nomeObra;

    @SerializedName("preco")
    @Expose
    private float preco;

    @SerializedName("quantidade")
    @Expose
    private int quantidade;

    @SerializedName("tecnica")
    @Expose
    private String tecnica;

    @SerializedName("desconto")
    @Expose
    private float desconto;

    @SerializedName("eExclusiva")
    @Expose
    private int eExclusiva;

    @SerializedName("descricao")
    @Expose
    private String descricao;

    @SerializedName("idArtista")
    @Expose
    private int idArtista;

    @SerializedName("idEspecialidade")
    @Expose
    private int idEspecialidade;

    public Obra() {
    }

    public Obra(int idObra, String nomeObra, float preco, int quantidade, String tecnica, float desconto, int eExclusiva, String descricao, int idArtista, int idEspecialidade) {
        this.idObra = idObra;
        this.nomeObra = nomeObra;
        this.preco = preco;
        this.quantidade = quantidade;
        this.tecnica = tecnica;
        this.desconto = desconto;
        this.eExclusiva = eExclusiva;
        this.descricao = descricao;
        this.idArtista = idArtista;
        this.idEspecialidade = idEspecialidade;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public String getNomeObra() {
        return nomeObra;
    }

    public void setNomeObra(String nomeObra) {
        this.nomeObra = nomeObra;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public int geteExclusiva() {
        return eExclusiva;
    }

    public void seteExclusiva(int eExclusiva) {
        this.eExclusiva = eExclusiva;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }
}
