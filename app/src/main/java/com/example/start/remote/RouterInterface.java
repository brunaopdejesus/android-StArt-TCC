package com.example.start.remote;

import com.example.start.model.Cliente;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RouterInterface {

    // INSERIR CLIENTE
    @POST("/cliente/cadastro")
    Call<Cliente> addCliente(@Body Cliente cliente);


    // INSERIR ARTISTA
//    @POST("/artista/cadastro")
//    Call<Artista> addArtista(@Body Artista artista);

    // LOGIN
//    @POST("/login")
//    Call<Cliente> loginCliente(@Body Cliente loginCliente);


}
