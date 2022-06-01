package com.example.start.remote;

import com.example.start.model.Artista;
import com.example.start.model.Cliente;
import com.example.start.model.Obra;

import java.util.Observable;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RouterInterface {

    // CADASTRO CLIENTE
    @POST("/cliente/cadastro")
    Call<Cliente> addCliente(@Body Cliente cliente);

    // RECEBER ESTADOS
    @GET("/diversas/estados")
    Call<String> getStates();

    // CADASTRO ARTISTA
    @POST("/artista/cadastro")
    Call<Artista> addArtista(@Body Artista artista);

    // ADICIONAR OBRA
    @POST("/obraPronta/inserirObra")
    Call<Obra> addObra(@Body Obra obra);



    // INFORMAÇÕES PERFIL
    @PUT("/artista/dadosPessoais")
    Call<Artista> getInformacoesArtista(@Body Artista artista);




//    // RECEBER CIDADES
//    @GET("/diversas/cidades/{idEstado}")
//    Call<String> getDistrict(@Path("id") int id);

//    // LOGIN CLIENTE
//    @POST("/cliente/login")
//    Call<Cliente> loginCliente();

//    @POST("cliente/login")
//    @FormUrlEncoded
//    Observable<String> loginCliente(@Field("emailLogin") String emailLogin, @Field("senhaLogin") String senhaLogin);

//    // LOGIN ARTISTA
//    @POST("/artista/login")
//    Call<Artista> loginArtista();

}




