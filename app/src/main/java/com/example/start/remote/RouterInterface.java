package com.example.start.remote;

import com.example.start.model.Artista;
import com.example.start.model.Cliente;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RouterInterface {

    /** CLIENTE **/
    // CADASTRO CLIENTE
    @POST("/cliente/cadastro")
    Call<Cliente> addCliente(@Body Cliente cliente);

        // RECEBER ESTADOS
        @GET("/diversas/estados")
        Call<String> getStates();

        // RECEBER CIDADES
        @GET("/diversas/cidades/{idEstado}")
        Call<String> getDistrict(@Path("id") int id);

    // LOGIN CLIENTE
    @POST("/cliente/login")
    Call<Cliente> loginCliente();


    /** ARTISTA **/
    // CADASTRO ARTISTA
    @POST("/artista/cadastro")
    Call<Artista> addArtista(@Body Artista artista);

    // LOGIN ARTISTA
    @POST("/artista/login")
    Call<Artista> loginArtista(@Path("emailLogin") String email, @Path("senhaLogin") String senha);

}




