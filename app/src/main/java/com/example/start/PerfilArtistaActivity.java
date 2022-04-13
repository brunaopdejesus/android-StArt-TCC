package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PerfilArtistaActivity extends AppCompatActivity {

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

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(PerfilArtistaActivity.this, HomeArtistaActivity.class));
        });

        // SETTINGS
//        settings.setOnClickListener(view -> {
//            startActivity(new Intent(PerfilArtistaActivity.this, ));
//        });

        addObra.setOnClickListener(view -> {
            startActivity(new Intent(PerfilArtistaActivity.this, AdicionarObraActivity.class));
        });

        obraArtista.setOnClickListener(view -> {
            startActivity(new Intent(PerfilArtistaActivity.this, PerfilArtistaModalActivity.class));
        });

}

}