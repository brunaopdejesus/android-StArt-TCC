package com.example.start.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cliente {

    @SerializedName("idCliente")
    @Expose
    private int idCliente;

    @SerializedName("nomeCompleto")
    @Expose
    private String nomeCompleto;

    @SerializedName("dataNascimento")
    @Expose
    private String dataNascimento;

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

    @SerializedName("contaEstaAtiva")
    @Expose
    private int contaEstaAtiva;

    @SerializedName("idCidade")
    @Expose
    private int idCidade;

    @SerializedName("rua")
    @Expose
    private String rua;

    @SerializedName("cep")
    @Expose
    private String cep;

    @SerializedName("numero")
    @Expose
    private String numero;

    @SerializedName("complemento")
    @Expose
    private String complemento;

    @SerializedName("bairro")
    @Expose
    private String bairro;

    public Cliente() {
    }

    public Cliente(int idCliente, String nomeCompleto, String dataNascimento, String telefoneCelular, String cpf_cnpj, String email, String senha, int contaEstaAtiva, int idCidade, String rua, String cep, String numero, String complemento, String bairro) {
        this.idCliente = idCliente;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.telefoneCelular = telefoneCelular;
        this.cpf_cnpj = cpf_cnpj;
        this.email = email;
        this.senha = senha;
        this.contaEstaAtiva = contaEstaAtiva;
        this.idCidade = idCidade;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

//    public void setDataNascimento(String dataNascimento) {
//    }

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

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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

    //    public int getIdCidade() {
//        return idCidade;
//    }
//
//    public void setIdCidade(int idCidade) {
//        this.idCidade = idCidade;
//    }

    //    public Cliente(int idCliente, String nomeCompleto, Date dataNascimento, String telefoneCelular, String cpf_cnpj, String endereco, String cep, int numero, String complemento, String bairro, String cidade, String estado, String biografia, String pais, String nacionalidade, String preferencia, String email, String senha, int contaEstaAtiva, int idEnderecoCliente, String fotoPerfilCliente) {
//        this.idCliente = idCliente;
//        this.nomeCompleto = nomeCompleto;
//        this.dataNascimento = dataNascimento;
//        this.telefoneCelular = telefoneCelular;
//        this.cpf_cnpj = cpf_cnpj;
//        this.endereco = endereco;
//        this.cep = cep;
//        this.numero = numero;
//        this.complemento = complemento;
//        this.bairro = bairro;
//        this.cidade = cidade;
//        this.estado = estado;
//        this.biografia = biografia;
//        this.pais = pais;
//        this.nacionalidade = nacionalidade;
//        this.preferencia = preferencia;
//        this.email = email;
//        this.senha = senha;
//        this.contaEstaAtiva = contaEstaAtiva;
//        this.idEnderecoCliente = idEnderecoCliente;
//        this.fotoPerfilCliente = fotoPerfilCliente;
//    }
//
//    public int getIdCliente() {
//        return idCliente;
//    }
//
//    public void setIdCliente(int idCliente) {
//        this.idCliente = idCliente;
//    }
//
//    public String getNomeCompleto() {
//        return nomeCompleto;
//    }
//
//    public void setNomeCompleto(String nomeCompleto) {
//        this.nomeCompleto = nomeCompleto;
//    }
//
//    public Date getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(Date dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }
//
//    public String getTelefoneCelular() {
//        return telefoneCelular;
//    }
//
//    public void setTelefoneCelular(String telefoneCelular) {
//        this.telefoneCelular = telefoneCelular;
//    }
//
//    public String getCpf_cnpj() {
//        return cpf_cnpj;
//    }
//
//    public void setCpf_cnpj(String cpf_cnpj) {
//        this.cpf_cnpj = cpf_cnpj;
//    }
//
//    public String getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(String endereco) {
//        this.endereco = endereco;
//    }
//
//    public String getCep() {
//        return cep;
//    }
//
//    public void setCep(String cep) {
//        this.cep = cep;
//    }
//
//    public int getNumero() {
//        return numero;
//    }
//
//    public void setNumero(int numero) {
//        this.numero = numero;
//    }
//
//    public String getComplemento() {
//        return complemento;
//    }
//
//    public void setComplemento(String complemento) {
//        this.complemento = complemento;
//    }
//
//    public String getBairro() {
//        return bairro;
//    }
//
//    public void setBairro(String bairro) {
//        this.bairro = bairro;
//    }
//
//    public String getCidade() {
//        return cidade;
//    }
//
//    public void setCidade(String cidade) {
//        this.cidade = cidade;
//    }
//
//    public String getEstado() {
//        return estado;
//    }
//
//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
//
//    public String getBiografia() {
//        return biografia;
//    }
//
//    public void setBiografia(String biografia) {
//        this.biografia = biografia;
//    }
//
//    public String getPais() {
//        return pais;
//    }
//
//    public void setPais(String pais) {
//        this.pais = pais;
//    }
//
//    public String getNacionalidade() {
//        return nacionalidade;
//    }
//
//    public void setNacionalidade(String nacionalidade) {
//        this.nacionalidade = nacionalidade;
//    }
//
//    public String getPreferencia() {
//        return preferencia;
//    }
//
//    public void setPreferencia(String preferencia) {
//        this.preferencia = preferencia;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
//
//    public int getContaEstaAtiva() {
//        return contaEstaAtiva;
//    }
//
//    public void setContaEstaAtiva(int contaEstaAtiva) {
//        this.contaEstaAtiva = contaEstaAtiva;
//    }
//
//    public int getIdEnderecoCliente() {
//        return idEnderecoCliente;
//    }
//
//    public void setIdEnderecoCliente(int idEnderecoCliente) {
//        this.idEnderecoCliente = idEnderecoCliente;
//    }
//
//    public String getFotoPerfilCliente() {
//        return fotoPerfilCliente;
//    }
//
//    public void setFotoPerfilCliente(String fotoPerfilCliente) {
//        this.fotoPerfilCliente = fotoPerfilCliente;
//    }


    ////////////////////////////////////////////////



    //    public int getIdCliente() {
//        return idCliente;
//    }
//
//    public void setIdCliente(int idCliente) {
//        this.idCliente = idCliente;
//    }
//
//    public String getNomeCompleto() {
//        return nomeCompleto;
//    }
//
//    public void setNomeCompleto(String nomeCompleto) {
//        this.nomeCompleto = nomeCompleto;
//    }
//
//    public Date getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(Date dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }
//
//    public String getTelefoneCelular() {
//        return telefoneCelular;
//    }
//
//    public void setTelefoneCelular(String telefoneCelular) {
//        this.telefoneCelular = telefoneCelular;
//    }
//
//    public String getCpf_cnpj() {
//        return cpf_cnpj;
//    }
//
//    public void setCpf_cnpj(String cpf_cnpj) {
//        this.cpf_cnpj = cpf_cnpj;
//    }
//
//    public String getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(String endereco) {
//        this.endereco = endereco;
//    }
//
//    public String getCep() {
//        return cep;
//    }
//
//    public void setCep(String cep) {
//        this.cep = cep;
//    }
//
//    public int getNumero() {
//        return numero;
//    }
//
//    public void setNumero(int numero) {
//        this.numero = numero;
//    }
//
//    public String getComplemento() {
//        return complemento;
//    }
//
//    public void setComplemento(String complemento) {
//        this.complemento = complemento;
//    }
//
//    public String getBairro() {
//        return bairro;
//    }
//
//    public void setBairro(String bairro) {
//        this.bairro = bairro;
//    }
//
//    public String getCidade() {
//        return cidade;
//    }
//
//    public void setCidade(String cidade) {
//        this.cidade = cidade;
//    }
//
//    public String getEstado() {
//        return estado;
//    }
//
//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
//
//    public String getBiografia() {
//        return biografia;
//    }
//
//    public void setBiografia(String biografia) {
//        this.biografia = biografia;
//    }
//
//    public String getPais() {
//        return pais;
//    }
//
//    public void setPais(String pais) {
//        this.pais = pais;
//    }
//
//    public String getNacionalidade() {
//        return nacionalidade;
//    }
//
//    public void setNacionalidade(String nacionalidade) {
//        this.nacionalidade = nacionalidade;
//    }
//
//    public String getPreferencia() {
//        return preferencia;
//    }
//
//    public void setPreferencia(String preferencia) {
//        this.preferencia = preferencia;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
//
//    public int getContaEstaAtiva() {
//        return contaEstaAtiva;
//    }
//
//    public void setContaEstaAtiva(int contaEstaAtiva) {
//        this.contaEstaAtiva = contaEstaAtiva;
//    }
//
//    public int getIdEnderecoCliente() {
//        return idEnderecoCliente;
//    }
//
//    public void setIdEnderecoCliente(int idEnderecoCliente) {
//        this.idEnderecoCliente = idEnderecoCliente;
//    }
//
//    public String getFotoPerfilCliente() {
//        return fotoPerfilCliente;
//    }
//
//    public void setFotoPerfilCliente(String fotoPerfilCliente) {
//        this.fotoPerfilCliente = fotoPerfilCliente;
//    }



    ///////////




    // SERIALIZED GERENCIADO PELO GSON
//    @SerializedName("idCliente")
//    @Expose
//    private int idCliente;
//
//    @SerializedName("nomeCompleto")
//    @Expose
//    private String nomeCompleto;
//
//    @SerializedName("dataNascimento")
//    @Expose
//    private Date dataNascimento;
//
//    @SerializedName("telefoneCelular")
//    @Expose
//    private String telefoneCelular;
//
//    @SerializedName("cpf_cnpj")
//    @Expose
//    private String cpf_cnpj;
//
//    @SerializedName("email")
//    @Expose
//    private String email;
//
//    @SerializedName("senha")
//    @Expose
//    private String senha;
//
//    @SerializedName("idCidade")
//    @Expose
//    private String cidade;
//
//    @SerializedName("rua")
//    @Expose
//    private String endereco;
//
//    @SerializedName("cep")
//    @Expose
//    private String cep;
//
//    @SerializedName("numero")
//    @Expose
//    private int numero;
//
//    @SerializedName("complemento")
//    @Expose
//    private String complemento;
//
//    @SerializedName("bairo")
//    @Expose
//    private String bairro;
//
//    @SerializedName("estado")
//    @Expose
//    private String estado;
//
//
//    public Cliente() {
//    }
//
//    public Cliente(int idCliente,
//                   String nomeCompleto,
//                   Date dataNascimento,
//                   String telefoneCelular,
//                   String cpf_cnpj,
//                   String cep,
//                   String endereco,
//                   int numero,
//                   String complemento,
//                   String bairro,
//                   String cidade,
//                   String estado,
//                   String email,
//                   String senha) {
//        this.idCliente = idCliente;
//        this.nomeCompleto = nomeCompleto;
//        this.dataNascimento = dataNascimento;
//        this.telefoneCelular = telefoneCelular;
//        this.cpf_cnpj = cpf_cnpj;
//        this.cep = cep;
//        this.endereco = endereco;
//        this.numero = numero;
//        this.complemento = complemento;
//        this.bairro = bairro;
//        this.cidade = cidade;
//        this.estado = estado;
//        this.email = email;
//        this.senha = senha;
//    }
//
//    public int getIdCliente() {
//        return idCliente;
//    }
//
//    public void setIdCliente(int idCliente) {
//        this.idCliente = idCliente;
//    }
//
//    public String getNomeCompleto() {
//        return nomeCompleto;
//    }
//
//    public void setNomeCompleto(String nomeCompleto) {
//        this.nomeCompleto = nomeCompleto;
//    }
//
//    public Date getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(Date dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }
//
//    public String getTelefoneCelular() {
//        return telefoneCelular;
//    }
//
//    public void setTelefoneCelular(String telefoneCelular) {
//        this.telefoneCelular = telefoneCelular;
//    }
//
//    public String getCpf_cnpj() {
//        return cpf_cnpj;
//    }
//
//    public void setCpf_cnpj(String cpf_cnpj) {
//        this.cpf_cnpj = cpf_cnpj;
//    }
//
//    public String getCep() {
//        return cep;
//    }
//
//    public void setCep(String cep) {
//        this.cep = cep;
//    }
//
//    public String getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(String endereco) {
//        this.endereco = endereco;
//    }
//
//    public int getNumero() {
//        return numero;
//    }
//
//    public void setNumero(int numero) {
//        this.numero = numero;
//    }
//
//    public String getComplemento() {
//        return complemento;
//    }
//
//    public void setComplemento(String complemento) {
//        this.complemento = complemento;
//    }
//
//    public String getBairro() {
//        return bairro;
//    }
//
//    public void setBairro(String bairro) {
//        this.bairro = bairro;
//    }
//
//    public String getCidade() {
//        return cidade;
//    }
//
//    public void setCidade(String cidade) {
//        this.cidade = cidade;
//    }
//
//    public String getEstado() {
//        return estado;
//    }
//
//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
//


    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
