package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
            finish();
            super.onBackPressed();
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CadastroClienteAcessoActivity.class);

                Cliente cliente = new Cliente();

                cliente.setNomeCompleto(intent.getStringExtra("nome"));
                cliente.setDataNascimento(intent.getStringExtra("dataNascimento"));
                cliente.setTelefoneCelular(intent.getStringExtra("telefone"));
                cliente.setCpf_cnpj(intent.getStringExtra("cpf"));
                cliente.setCep(intent.getStringExtra("cep"));
                cliente.setEndereco(intent.getStringExtra("endereco"));
                cliente.setNumero(intent.getIntExtra("numero", 0));
                cliente.setComplemento(intent.getStringExtra("complemento"));
                cliente.setBairro(intent.getStringExtra("bairro"));
                cliente.setCidade(intent.getStringExtra("cidade"));
                cliente.setEstado(intent.getStringExtra("estado"));
                cliente.setEmail(txtEmail.getText().toString());
                cliente.setSenha(txtSenha.getText().toString());

                routerInterface = APIUtil.getUsuarioInterface();
                addCliente(cliente);

            }
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
                Toast.makeText(CadastroClienteAcessoActivity.this, "Erro ao cadastrar usuário",
                        Toast.LENGTH_SHORT).show();
                Log.d("Erro-API", t.getMessage());
            }
        });

    }

}