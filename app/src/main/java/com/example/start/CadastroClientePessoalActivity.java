package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;

public class CadastroClientePessoalActivity extends AppCompatActivity {

    private ImageView arrowBack;
//    private EditText txtNome;
//    private Date dtDataNascimento;
//    private EditText txtTelefone;
//    private EditText txtCpf;
    private TextView txtJaPossuiConta;
    private Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_pessoal);

        arrowBack = findViewById(R.id.image_back_cadastro_cliente_pessoal);
        final EditText etNome = findViewById(R.id.et_nome_cadastro_cliente);
//        final Date dtDataNascimento = findViewById(R.id.et_data_nascimento_cadastro_cliente);
        final EditText etNome = findViewById(R.id.et_nome_cadastro_cliente);
        final Date dtDataNascimento = findViewById(R.id.et_data_nascimento_cadastro_cliente);
//        txtTelefone = findViewById(R.id.et_telefone_cadastro_cliente);
//        txtCpf = findViewById(R.id.et_cpf_cadastro_cliente);

        txtJaPossuiConta = findViewById(R.id.tv_ja_possui_conta_cadastro_cliente);
        btnContinuar = findViewById(R.id.btn_continuar_cadastro_cliente_pessoal);

        Intent i = new Intent(CadastroClientePessoalActivity.this, CadastroClienteEnderecoActivity.class);
        i.putExtra("key",);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClientePessoalActivity.this, TipoCadastroActivity.class));
        });

        txtJaPossuiConta.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClientePessoalActivity.this, LoginActivity.class));
        });

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), CadastroClienteEnderecoActivity.class);
                Intent intent = getIntent();
            }
        });


//        btnContinuar.setOnClickListener(view -> {
//
//
//
//
////            startActivity(new Intent(CadastroClientePessoalActivity.this, CadastroClienteEnderecoActivity.class));
//        });


    }
}