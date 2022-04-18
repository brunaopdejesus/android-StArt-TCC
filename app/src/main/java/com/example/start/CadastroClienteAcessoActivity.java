package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

    private ImageView arrowBack;
    private EditText txtEmail;
    private EditText txtSenha;
    private Button btnCadastrar;

    RouterInterface routerInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_acesso);

        arrowBack = findViewById(R.id.image_back_cadastro_cliente_acesso);
        txtEmail = findViewById(R.id.et_email_cadastro_cliente_acesso);
        txtSenha = findViewById(R.id.et_senha_cadastro_cliente_acesso);
        btnCadastrar = findViewById(R.id.btn_cadastrar_cadastro_cliente_acesso);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClienteAcessoActivity.this, CadastroClienteEnderecoActivity.class));
        });

        btnCadastrar.setOnClickListener(view -> {

            Cliente cliente = new Cliente();

            cliente.setNomeCompleto(txtEmail.getText().toString());
            cliente.setSenha(txtSenha.getText().toString());

            routerInterface = APIUtil.getUsuarioInterface();

            addCliente(cliente);

        });

    }

    public void addCliente(Cliente cliente) {

        Call<Cliente> call = routerInterface.addCliente(cliente);

        call.enqueue(new Callback<Cliente>() {
            @Override
            public void onResponse(Call<Cliente> call, Response<Cliente> response) {
                Toast.makeText(CadastroClienteAcessoActivity.this, "Usuário cadastrado com sucesso",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Cliente> call, Throwable t) {
                Log.d("Erro-API", t.getMessage());
            }
        });

    }

}