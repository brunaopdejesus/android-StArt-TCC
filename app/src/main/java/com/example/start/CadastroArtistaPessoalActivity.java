package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CadastroArtistaPessoalActivity extends AppCompatActivity {

    private ImageView arrowBack;
    private EditText txtNome;
    private EditText txtDataNascimento;
    private EditText txtTelefone;
    private EditText txtCpf;
    private TextView txtJaPossuiConta;
    private Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_artista_pessoal);

        arrowBack = findViewById(R.id.image_back_cadastro_artista_pessoal);
        txtNome = findViewById(R.id.et_email_login);
        txtDataNascimento = findViewById(R.id.et_data_nascimento_cadastro_artista);
        txtTelefone = findViewById(R.id.et_telefone_cadastro_artista);
        txtCpf = findViewById(R.id.et_cpf_cadastro_artista);
        txtJaPossuiConta = findViewById(R.id.tv_ja_possui_conta_cadastro_artista);
        btnContinuar = findViewById(R.id.btn_continuar_cadastro_artista_pessoal);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(CadastroArtistaPessoalActivity.this, TipoCadastroActivity.class));
        });

        txtJaPossuiConta.setOnClickListener(view -> {
            startActivity(new Intent(CadastroArtistaPessoalActivity.this, LoginActivity.class));
        });

        btnContinuar.setOnClickListener(view -> {
            startActivity(new Intent(CadastroArtistaPessoalActivity.this, CadastroArtistaPagamentoPixActivity.class));
        });


    }
}