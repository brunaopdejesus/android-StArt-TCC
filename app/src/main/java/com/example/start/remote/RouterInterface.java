package com.example.start.remote;

import com.example.start.model.Cliente;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RouterInterface {

    /** CADASTRO CLIENTE **/
    // INSERIR CLIENTE
    @POST("/cliente/cadastro")
    Call<Cliente> addCliente(@Body Cliente cliente);

    // RECEBER ESTADOS
    @GET("/diversas/estados")
    Call<String> getStates();

    // RECEBER CIDADES
    @GET("/diversas/cidades/{idEstado}")
    Call<String> getDistrict(@Path("id") int id);





    // LOGIN CLIENTE
    @GET("/cliente/login{email}{senha}")
    Call<Cliente> loginCliente(@Path("email") String email, @Path("senha") String senha);

//    // LOGIN CLIENTE
//    @POST("/cliente/login")
//    Call loginCliente(@Path("email") String email, @Path("senha") String senha);

}

// INSERIR ARTISTA
//    @POST("/artista/cadastro")
//    Call<Artista> addArtista(@Body Artista artista);

// LOGIN
//    @POST("/login")
//    Call<Cliente> loginCliente(@Body Cliente loginCliente);

//
//    @GET("login/{username}/{password}")
//    Call login(@Path("username") String username, @Path("password") String password);

