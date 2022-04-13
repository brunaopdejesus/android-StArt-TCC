package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class PerfilArtistaModalActivity extends AppCompatActivity {

    private ImageView arrowBack;
    private Button btnExcluir;
    private Button btnEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_artista_modal);

        arrowBack = findViewById(R.id.image_back_perfil_artista_modal);
        btnExcluir = findViewById(R.id.btn_excluir_obra);
        btnEditar = findViewById(R.id.btn_editar_obra);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(PerfilArtistaModalActivity.this, PerfilArtistaActivity.class));
        });

//        btnExcluir.setOnClickListener(view -> {
//            startActivity(new Intent(PerfilArtistaModalActivity.this, .class));
//        });
//
//        btnEditar.setOnClickListener(view -> {
//            startActivity(new Intent(PerfilArtistaModalActivity.this, .class));
//        });

    }
}