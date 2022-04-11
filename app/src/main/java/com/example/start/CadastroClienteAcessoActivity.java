package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class CadastroClienteAcessoActivity extends AppCompatActivity {

    private ImageView arrowBack;
    private EditText txtEmail;
    private EditText txtSenha;
    private EditText txtConfirmarSenha;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_acesso);

        arrowBack = findViewById(R.id.image_back_cadastro_cliente_acesso);
        txtEmail = findViewById(R.id.et_email_cadastro_cliente_acesso);
        txtSenha = findViewById(R.id.et_senha_cadastro_cliente_acesso);
        txtConfirmarSenha = findViewById(R.id.et_confirmar_senha_cadastro_cliente_acesso);
        btnCadastrar = findViewById(R.id.btn_cadastrar_cadastro_cliente_acesso);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClienteAcessoActivity.this, CadastroClienteEnderecoActivity.class));
        });

        btnCadastrar.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClienteAcessoActivity.this, BoasVindasCliente1Activity.class));
        });




    }
}