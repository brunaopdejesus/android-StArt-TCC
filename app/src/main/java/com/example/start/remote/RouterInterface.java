package com.example.start.remote;

import com.example.start.model.Cliente;
import com.example.start.model.Estado;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RouterInterface {

    // INSERIR CLIENTE
    @POST("/cliente/cadastro")
    Call<Cliente> addCliente(@Body Cliente cliente);

    // LOGIN CLIENTE
    @GET("/cliente/login{email}{senha}")
    Call<Cliente> loginCliente(@Path("email") String email, @Path("senha") String senha);

    // RECEBER ESTADOS
    @GET("/diversas/estados")
    Call<List<Estado>> getEstados();


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

