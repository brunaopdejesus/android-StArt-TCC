package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.start.model.Artista;
import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PerfilArtistaActivity extends AppCompatActivity {

    RouterInterface routerInterface;
    private ImageView arrowBack;
    private ImageView settings;
    private ImageView addObra;
    private ImageView obraArtista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_artista);

        arrowBack = findViewById(R.id.image_back_perfil_artista);
        settings = findViewById(R.id.icon_setting_artista);
        addObra = findViewById(R.id.ic_adicionar_obra_perfil_artista);
        obraArtista = findViewById(R.id.obra_perfil_artista);

        routerInterface = APIUtil.getUsuarioInterface();



//        int idArtista = 14;
//
//        Call<Artista> call = routerInterface.getInformacoesArtista(id);
//        call.enqueue(new Callback<Artista>() {
//            @Override
//            public void onResponse(Call<Artista> call, Response<Artista> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<Artista> call, Throwable t) {
//
//            }
//        });



//        arrowBack.setOnClickListener(view -> {
//            startActivity(new Intent(PerfilArtistaActivity.this, HomeArtistaActivity.class));
//        });
//
//        settings.setOnClickListener(view -> {
//            startActivity(new Intent(PerfilArtistaActivity.this, ConfiguracoesArtistaActivity.class));
//        });
//
        addObra.setOnClickListener(view -> {

            startActivity(new Intent(PerfilArtistaActivity.this, AdicionarObraActivity.class));

        });
//
//        obraArtista.setOnClickListener(view -> {
//            startActivity(new Intent(PerfilArtistaActivity.this, PerfilArtistaModalActivity.class));
//        });

}

    private void preencherInformacoesPerfilArtista(Artista artista) {

        Call<Artista> call = routerInterface.getInformacoesArtista(artista);

        call.enqueue(new Callback<Artista>() {
            @Override
            public void onResponse(Call<Artista> call, Response<Artista> response) {
                Log.d("TESTE-", "TESTE RECEBER DATA");
                Log.d("TESTE-", String.valueOf(response.isSuccessful()));
                Toast.makeText(PerfilArtistaActivity.this, "Dados recebidos com sucesso", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Artista> call, Throwable t) {
                Log.d("TESTE-", "TESTE3");
                Log.d("Erro-API", t.getMessage());
            }
        });

    }

}