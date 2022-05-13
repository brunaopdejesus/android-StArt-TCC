package com.example.start.remote;

import com.example.start.model.Artista;
import com.example.start.model.Cliente;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RouterInterface {

    /** CLIENTE **/
    // CADASTRAR CLIENTE
    @POST("/cliente/cadastro")
    Call<Cliente> addCliente(@Body Cliente cliente);

        // RECEBER ESTADOS
        @GET("/diversas/estados")
        Call<String> getStates();

        // RECEBER CIDADES
        @GET("/diversas/cidades/{idEstado}")
        Call<String> getDistrict(@Path("id") int id);

    // LOGIN CLIENTE
    @GET("/middleware/loginCliente")
    Call<Cliente> loginCliente(@Path("email") String email, @Path("hash") String senha);

    /** ARTISTA **/
    @POST("/artista/cadastro")
    Call<Artista> addArtista(@Body Artista artista);







}

// LOGIN CLIENTE E ARTISTA
//    @POST("/cliente/login")
//    Call loginCliente(@Path("email") String email, @Path("senha") String senha);

// LOGIN
//    @POST("/login")
//    Call<Cliente> loginCliente(@Body Cliente loginCliente);

//
//    @GET("login/{username}/{password}")
//    Call login(@Path("username") String username, @Path("password") String password);

