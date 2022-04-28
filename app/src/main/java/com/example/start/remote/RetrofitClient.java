package com.example.start.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    // RETROFIT É O RESPONSÁVEL POR FAZER A CONEXÃO COM A API
    // STATIC PORQUE SERÁ USADA EM VÁRIOS MOMENTOS
    private static Retrofit retrofit = null;

    /* Método de acesso ao cliente */
    public static Retrofit getClient(String url) {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return retrofit;
    }
}