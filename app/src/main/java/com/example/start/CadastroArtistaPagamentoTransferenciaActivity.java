package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.start.R;

public class CadastroArtistaPagamentoTransferenciaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_artista_pagamento_transferencia);

        final TextView pix = findViewById(R.id.pix_trocar_tela_transferencia);

        pix.setOnClickListener(view -> {
            startActivity(new Intent(CadastroArtistaPagamentoTransferenciaActivity.this, CadastroArtistaPagamentoPixActivity.class));
        });


    }
}