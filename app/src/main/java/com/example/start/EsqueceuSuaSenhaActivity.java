package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class EsqueceuSuaSenhaActivity extends AppCompatActivity {

    private ImageView arrowBack;
    private EditText txtEmail;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueceu_sua_senha);

        arrowBack = findViewById(R.id.image_back_esqueceu_sua_senha);
        txtEmail = findViewById(R.id.et_email_esqueceu_sua_senha);
        btnEnviar = findViewById(R.id.btn_enviar_esqueceu_sua_senha);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(EsqueceuSuaSenhaActivity.this, LoginActivity.class));
        });

        btnEnviar.setOnClickListener(view -> {
            startActivity(new Intent(EsqueceuSuaSenhaActivity.this, LoginActivity.class));
        });

    }
}