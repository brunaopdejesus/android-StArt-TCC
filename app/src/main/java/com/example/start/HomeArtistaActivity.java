package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.start.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeArtistaActivity extends AppCompatActivity {

    private TextView tv_acessar_perfil;
    private ImageView img_acessar_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_artista);

        tv_acessar_perfil = findViewById(R.id.tv_acessar_perfil_artista);
        img_acessar_perfil = findViewById(R.id.iv_acessar_perfil_artista);

        tv_acessar_perfil.setOnClickListener(view -> {
            startActivity(new Intent(HomeArtistaActivity.this, PerfilArtistaActivity.class));
        });

        img_acessar_perfil.setOnClickListener(view -> {
            startActivity(new Intent(HomeArtistaActivity.this, PerfilArtistaActivity.class));
        });

    }
}