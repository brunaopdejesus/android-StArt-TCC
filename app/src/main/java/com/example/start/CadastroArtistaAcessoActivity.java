package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.start.R;
import com.example.start.model.Artista;
import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;

public class CadastroArtistaAcessoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_artista_acesso);

        final ImageView arrowBack = findViewById(R.id.image_back_cadastro_artista_acesso);
        final EditText etEmail = findViewById(R.id.et_email_cadastro_artista_acesso);
        final EditText etSenha = findViewById(R.id.et_senha_cadastro_artista_acesso);
        final Button btnCadastrar = findViewById(R.id.btn_continuar_cadastro_artista_acesso);
        final RouterInterface routerInterface;

        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });

        btnCadastrar.setOnClickListener(view -> {

            Artista artista = new Artista();

            artista.setNomeCompleto(getIntent().getExtras().getString("nome"));
            artista.setDataNascimento(getIntent().getExtras().getString("dataNascimento"));
            artista.setTelefoneCelular(getIntent().getExtras().getString("telefone"));
            artista.setCpf_cnpj(getIntent().getExtras().getString("cpf"));
            artista.setEmail(etEmail.getText().toString());
            artista.setSenha(etSenha.getText().toString());



        });

    }
}