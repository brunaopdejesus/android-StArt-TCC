package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CadastroClienteEnderecoActivity extends AppCompatActivity {

    private ImageView arrowBack;
    private EditText txtCep;
    private EditText txtEndereco;
    private EditText txtNumero;
    private EditText txtComplemento;
    private EditText txtBairro;
    private EditText txtCidade;
    private EditText txtEstado;
    private Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_endereco);

        arrowBack = findViewById(R.id.image_back_cadastro_cliente_endereco);
        txtCep = findViewById(R.id.et_cep_cadastro_cliente);
        txtEndereco = findViewById(R.id.et_endereco_cadastro_cliente);
        txtNumero = findViewById(R.id.et_numero_cadastro_endereco);
        txtComplemento = findViewById(R.id.et_complemento_cadastro_endereco);
        txtBairro = findViewById(R.id.et_bairro_cadastro_cliente);
        txtCidade = findViewById(R.id.et_cidade_cadastro_endereco);
        txtEstado = findViewById(R.id.et_estado_cadastro_endereco);
        btnContinuar = findViewById(R.id.btn_continuar_cadastro_cliente_endereco);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClienteEnderecoActivity.this, CadastroClientePessoalActivity.class));
        });

        btnContinuar.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClienteEnderecoActivity.this, CadastroClienteAcessoActivity.class));
        });

    }
}