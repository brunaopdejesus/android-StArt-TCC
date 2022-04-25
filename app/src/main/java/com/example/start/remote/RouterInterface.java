package com.example.start.remote;

import com.example.start.model.Cliente;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RouterInterface {

    // INSERIR CLIENTE
    @POST("/cadastro/")
    Call<Cliente> addCliente(@Body Cliente cliente);

}
