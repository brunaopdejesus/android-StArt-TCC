package com.example.start.remote;

import com.example.start.model.Artista;
import com.example.start.model.Cliente;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RouterInterface {

    // INSERIR CLIENTE
    @POST("/cadastro")
    Call<Cliente> addCliente(@Body Cliente cliente);

    // LOGIN
    @POST("/login")
    Call<Cliente> loginCliente(@Body Cliente loginCliente);

    // INSERIR ARTISTA
    @POST("/cadastro")
    Call<Artista> addArtista(@Body Artista artista);


}
