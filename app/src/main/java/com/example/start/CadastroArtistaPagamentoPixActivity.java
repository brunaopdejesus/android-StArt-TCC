package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.start.R;

public class CadastroArtistaPagamentoPixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_artista_pagamento_pix);

        final ImageView arrowBack = findViewById(R.id.image_back_cadastro_cliente_pessoal);
        final TextView tvTransferencia = findViewById(R.id.transferencia_bancaria);
        final Spinner spinner = findViewById(R.id.sp_pix);
        final Button btnContinuar = findViewById(R.id.btn_continuar_cadastro_artista_pix);

        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });


    }
}