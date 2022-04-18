package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView txtCadastrar;
    private EditText txtEmail;
    private EditText txtSenha;
    private TextView txtEsqueceuSuaSenha;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtCadastrar = findViewById(R.id.tv_cadastre_login);
        txtEmail = findViewById(R.id.et_email_login);
        txtSenha = findViewById(R.id.et_senha_login);
        txtEsqueceuSuaSenha = findViewById(R.id.tv_esqueceu_sua_senha_login);
        btnEntrar = findViewById(R.id.btn_entrar_login);

        txtCadastrar.setOnClickListener(view -> {
             startActivity(new Intent(LoginActivity.this, TipoCadastroActivity.class));
        });

        txtEsqueceuSuaSenha.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, EsqueceuSuaSenhaActivity.class));
        });

    }
}