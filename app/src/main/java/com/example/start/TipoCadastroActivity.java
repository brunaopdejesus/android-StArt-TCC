package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class TipoCadastroActivity extends AppCompatActivity {

    private ImageView arrowBack;
    private Button btnContinuarCliente;
    private Button btnContinuarArtista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_cadastro);

        arrowBack = findViewById(R.id.image_back_tipo_cadastro);
        btnContinuarCliente = findViewById(R.id.btn_continuar_cliente_tipo_cadastro);
        btnContinuarArtista = findViewById(R.id.btn_continuar_artista_tipo_cadastro);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(TipoCadastroActivity.this, LoginActivity.class));
        });

        btnContinuarCliente.setOnClickListener(view -> {
            startActivity(new Intent(TipoCadastroActivity.this, CadastroClientePessoalActivity.class));
        });

        btnContinuarArtista.setOnClickListener(view -> {
            startActivity(new Intent(TipoCadastroActivity.this, CadastroArtistaPessoalActivity.class));
        });

    }
}