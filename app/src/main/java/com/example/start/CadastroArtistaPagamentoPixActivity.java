package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.start.R;
import com.example.start.remote.RouterInterface;

public class CadastroArtistaPagamentoPixActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mypref_artista";
    private static final String PIX = "pix";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_artista_pagamento_pix);

        final ImageView arrowBack = findViewById(R.id.image_back_cadastro_artista_pagamento_pix);
        final TextView tvTransferencia = findViewById(R.id.transferencia_bancaria);
//        final Spinner spinnerOpcaoPix = findViewById(R.id.sp_pix);
        final EditText etOpcaoPix = findViewById(R.id.et_pix);
        final Button btnContinuar = findViewById(R.id.btn_continuar_cadastro_artista_pix);
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });

        btnContinuar.setOnClickListener(view -> {

            // when click a button put data on SharedPreferences
            SharedPreferences.Editor editor = sharedPreferences.edit();

            // putting data
            editor.putString(PIX,etOpcaoPix.getText().toString());
            editor.apply();

            // start next activity
            startActivity(new Intent(CadastroArtistaPagamentoPixActivity.this, CadastroArtistaAcessoActivity.class));

        });

    }
}