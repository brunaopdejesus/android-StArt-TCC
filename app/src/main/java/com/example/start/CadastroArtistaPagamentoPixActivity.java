package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    RouterInterface routerInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_artista_pagamento_pix);

        final ImageView arrowBack = findViewById(R.id.image_back_cadastro_artista_pagamento_pix);
        final TextView tvTransferencia = findViewById(R.id.transferencia_bancaria);
//        final Spinner spinnerOpcaoPix = findViewById(R.id.sp_pix);
        final EditText etOpcaoPix = findViewById(R.id.et_pix);
        final Button btnContinuar = findViewById(R.id.btn_continuar_cadastro_artista_pix);

        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });

        btnContinuar.setOnClickListener(view -> {

            Intent intent = new Intent(getApplicationContext(), CadastroArtistaAcessoActivity.class);
            intent.putExtra("nomeCompleto", intent.getStringExtra("nomeCompleto"));
            intent.putExtra("nomeArtistico", intent.getStringExtra("nomeArtistico"));
            intent.putExtra("dataNascimento", intent.getStringExtra("dataNascimento"));
            intent.putExtra("telefone", intent.getStringExtra("telefone"));
            intent.putExtra("cpf", intent.getStringExtra("cpf"));

//            intent.putExtra("spinner_pix", spinnerOpcaoPix.getSelectedItem().toString());

            intent.putExtra("pix", etOpcaoPix.getText().toString());
            startActivity(intent);

        });

    }
}