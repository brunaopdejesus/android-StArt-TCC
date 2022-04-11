package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CadastroClientePessoalActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_cadastro_cliente_pessoal);

        arrowBack = findViewById(R.id.image_back_cadastro_cliente_pessoal);
        txtNome = findViewById(R.id.et_nome_cadastro_cliente);
        txtDataNascimento = findViewById(R.id.et_data_nascimento_cadastro_cliente);
        txtTelefone = findViewById(R.id.et_telefone_cadastro_cliente);
        txtCpf = findViewById(R.id.et_cpf_cadastro_cliente);
        txtJaPossuiConta = findViewById(R.id.tv_ja_possui_conta_cadastro_cliente);
        btnContinuar = findViewById(R.id.btn_continuar_cadastro_cliente_pessoal);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClientePessoalActivity.this, TipoCadastroActivity.class));
        });

        txtJaPossuiConta.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClientePessoalActivity.this, LoginActivity.class));
        });

        btnContinuar.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClientePessoalActivity.this, CadastroClienteEnderecoActivity.class));
        });


    }
}