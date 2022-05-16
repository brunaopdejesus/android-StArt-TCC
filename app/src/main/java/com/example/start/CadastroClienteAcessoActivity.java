package com.example.start;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.start.model.Cliente;
import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastroClienteAcessoActivity extends AppCompatActivity {

    RouterInterface routerInterface;
    SharedPreferences sharedPreferences;

    private ImageView arrowBack;
    private EditText txtEmail;
    private EditText txtSenha;
    private Button btnCadastrar;

    private static final String SHARED_PREF_NAME = "mypref_cliente";
    private static final String NOME_COMPLETO_CLIENTE = "nomeCompleto";
    private static final String DATA_NASCIMENTO_CLIENTE = "dataNascimento";
    private static final String TELEFONE_CLIENTE = "telefone";
    private static final String CPF_CNPJ_CLIENTE = "cpfCnpj";

    private static final String CEP = "cep";
    private static final String ENDERECO = "endereco";
    private static final String NUMERO = "numero";
    private static final String COMPLEMENTO = "complemento";
    private static final String BAIRRO = "bairro";
//    private static final String ESTADO = "estado";
//    private static final String CIDADE = "cidade";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_acesso);

        arrowBack = findViewById(R.id.image_back_cadastro_cliente_acesso);
        txtEmail = findViewById(R.id.et_email_cadastro_cliente_acesso);
        txtSenha = findViewById(R.id.et_senha_cadastro_cliente_acesso);
        btnCadastrar = findViewById(R.id.btn_cadastrar_cadastro_cliente_acesso);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });

        btnCadastrar.setOnClickListener(view -> {

            if (TextUtils.isEmpty(txtEmail.getText().toString())) {
                txtEmail.setError("Insira seu telefone");
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();

                return;
            }

            if (TextUtils.isEmpty(txtSenha.getText().toString())) {
                txtSenha.setError("Insira seu CPF ou CPNJ");
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();

                return;
            }

            Cliente cliente = new Cliente();

            cliente.setNomeCompleto(sharedPreferences.getString(NOME_COMPLETO_CLIENTE, ""));
            cliente.setDataNascimento(sharedPreferences.getString(DATA_NASCIMENTO_CLIENTE, null));
            cliente.setTelefoneCelular(sharedPreferences.getString(TELEFONE_CLIENTE, ""));
            cliente.setCpf_cnpj(sharedPreferences.getString(CPF_CNPJ_CLIENTE, ""));

            cliente.setCep(sharedPreferences.getString(CEP, ""));
            cliente.setRua(sharedPreferences.getString(ENDERECO, ""));
            cliente.setNumero(sharedPreferences.getString(NUMERO, ""));
            cliente.setComplemento(sharedPreferences.getString(COMPLEMENTO, ""));
            cliente.setBairro(sharedPreferences.getString(BAIRRO, ""));
//            cliente.setEstado(sharedPreferences.getString(ESTADO, ""));
//            cliente.setCidade(sharedPreferences.getString(CIDADE, ""));

            cliente.setEmail(txtEmail.getText().toString());
            cliente.setSenha(txtSenha.getText().toString());

            cliente.setUserType(0);

            cliente.setContaEstaAtiva(1);
            cliente.setIdCidade(4771);
//            cliente.setIdEnderecoCliente(9);

            routerInterface = APIUtil.getUsuarioInterface();
            addCliente(cliente);

            startActivity(new Intent(CadastroClienteAcessoActivity.this, HomeClienteActivity.class));

        });

    }

    public void addCliente(Cliente cliente) {

        Log.d("TESTE-", "TESTE1");

        Call<Cliente> call = routerInterface.addCliente(cliente);

        call.enqueue(new Callback<Cliente>() {
            @Override
            public void onResponse(Call<Cliente> call, Response<Cliente> response) {
                Log.d("TESTE-", "TESTE2");
                Log.d("TESTE-", String.valueOf(response.isSuccessful()));
                Toast.makeText(CadastroClienteAcessoActivity.this, "Usuário cadastrado com sucesso",
                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(Call<Cliente> call, Throwable t) {
                Log.d("TESTE-", "TESTE3");
                Log.d("Erro-API", t.getMessage());
            }
        });

    }

}