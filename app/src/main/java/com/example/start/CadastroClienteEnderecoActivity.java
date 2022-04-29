package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.List;

public class CadastroClienteEnderecoActivity extends AppCompatActivity {

    private ImageView arrowBack;
    private EditText txtCep;
    private EditText txtEndereco;
    private EditText txtNumero;
    private EditText txtComplemento;
    private EditText txtBairro;
    private EditText txtCidade;
    private Spinner spinner;
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
        spinner = findViewById(R.id.sp_estado_cadastro_cliente);
        btnContinuar = findViewById(R.id.btn_continuar_cadastro_cliente_endereco);

        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });

        btnContinuar.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), CadastroClienteAcessoActivity.class);
            intent.putExtra("nome", intent.getStringExtra("nome"));
            intent.putExtra("dataNascimento", intent.getStringExtra("dataNascimento"));
            intent.putExtra("telefone", intent.getStringExtra("telefone"));
            intent.putExtra("cpf", intent.getStringExtra("cpf"));

            intent.putExtra("cep", txtCep.getText().toString());
            intent.putExtra("endereco", txtEndereco.getText().toString());
//                intent.putExtra("numero", txtNumero.getText().toString());
            intent.putExtra("numero", txtNumero.getText().toString());
            intent.putExtra("complemento", txtComplemento.getText().toString());
            intent.putExtra("bairro", txtBairro.getText().toString());
            intent.putExtra("cidade", txtCidade.getText().toString());
            intent.putExtra("estado", spinner.getSelectedItem().toString());
            startActivity(intent);
        });



    }


}