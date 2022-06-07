package com.example.start;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.start.model.Artista;
import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;
import com.google.android.material.bottomnavigation.BottomNavigationView;

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

    // textviews que receberão dados
    private TextView tv_nome_principal;
    private TextView tv_nome_completo;
    private TextView tv_especialidade;
    private TextView tv_nacionalidade;
    private TextView tv_pais;

    private final int idArtista = 14;

    Artista artista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_artista);

        arrowBack = findViewById(R.id.image_back_perfil_artista);
        settings = findViewById(R.id.icon_setting_artista);
        addObra = findViewById(R.id.ic_adicionar_obra_perfil_artista);
        obraArtista = findViewById(R.id.obra_perfil_artista);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.page_home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.page_add_obra:
                        startActivity(new Intent(getApplicationContext(), AdicionarObraActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.page_home:
                        startActivity(new Intent(getApplicationContext(), HomeArtistaActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.page_profile:
                        startActivity(new Intent(getApplicationContext(), PerfilArtistaActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        tv_nome_principal = findViewById(R.id.perfil_artista_nome);

        routerInterface = APIUtil.getUsuarioInterface();
        Call<Artista> callingArtist = routerInterface.getInformacoesArtista(artista);
        callingArtist.enqueue(new Callback<Artista>() {
            @Override
            public void onResponse(Call<Artista> call, Response<Artista> response) {
                if (response.isSuccessful()) {
                    tv_nome_principal.setText(artista.getNomeCompleto());
                }
            }

            @Override
            public void onFailure(Call<Artista> call, Throwable t) {
                Log.d("TESTE-", "TESTE4");
                Log.d("Erro-API", t.getMessage() + "onFailure callingArtist");
            }
        });

        preencherInformacoesPerfilArtista(artista, idArtista);

        addObra.setOnClickListener(view -> {
            startActivity(new Intent(PerfilArtistaActivity.this, AdicionarObraActivity.class));
        });

}

    private void preencherInformacoesPerfilArtista(Artista artista, int idArtista) {

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
                Log.d("Erro-API", t.getMessage() + "onFailure call preencherInformacoesArtista");
            }
        });

    }

}