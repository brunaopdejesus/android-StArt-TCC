package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.CaptureFailure;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.start.model.Artista;
import com.example.start.model.Cliente;
import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {

    RouterInterface routerInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView txtCadastrar = findViewById(R.id.tv_cadastre_login);
        final EditText txtEmail = findViewById(R.id.et_email_login);
        final EditText txtSenha = findViewById(R.id.et_senha_login);
        final TextView txtEsqueceuSuaSenha = findViewById(R.id.tv_esqueceu_sua_senha_login);
        final Button btnEntrar = findViewById(R.id.btn_entrar_login);

        txtCadastrar.setOnClickListener(view -> {
             startActivity(new Intent(LoginActivity.this, TipoCadastroActivity.class));
        });

        txtEsqueceuSuaSenha.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, EsqueceuSuaSenhaActivity.class));
        });

        btnEntrar.setOnClickListener(view -> {

            String etEmail = txtEmail.getText().toString();
            String etSenha = txtSenha.getText().toString();

//            if (etEmail == null || etEmail.trim().length() == 0) {
//                Toast.makeText(LoginActivity.this, "Insira seu e-mail", Toast.LENGTH_SHORT).show();
//                return;
//            }


//            if (etSenha == null || etSenha.trim().length() == 0) {
//                Toast.makeText(LoginActivity.this, "Insira sua senha", Toast.LENGTH_SHORT).show();
//                return;
//            }

            routerInterface = APIUtil.getUsuarioInterface();
            loginCliente(etEmail, etSenha);



//            loginArtista(email, senha);

//            doLogin(email, senha, userType);
//            doLogin(email, senha);

        });

    }

    public void loginCliente(String email, String senha) {

        Call<Cliente> call = routerInterface.loginCliente();
        call.enqueue(new Callback<Cliente>() {
            @Override
            public void onResponse(Call<Cliente> call, Response<Cliente> response) {
                Toast.makeText(LoginActivity.this, "FUNCIONOU", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, HomeClienteActivity.class));
            }

            @Override
            public void onFailure(Call<Cliente> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "PUTS", Toast.LENGTH_SHORT).show();
            }
        });

//        Call<Cliente> callCliente = routerInterface.loginCliente(email, senha);
//        callCliente.enqueue(new Callback<Cliente>() {
//            @Override
//            public void onResponse(Call<Cliente> call, Response<Cliente> response) {
//                startActivity(new Intent(LoginActivity.this, HomeClienteActivity.class));
//            }
//
//            @Override
//            public void onFailure(Call<Cliente> call, Throwable t) {
//                Toast.makeText(LoginActivity.this, "Cliente não cadastrado", Toast.LENGTH_SHORT).show();
//            }
//        });

    }



//
//    public void loginArtista(String email, String senha) {
//        Call<Artista> callArtista = routerInterface.loginArtista(email, senha);
//        if (email == email && senha == senha) {
//            startActivity(new Intent(LoginActivity.this, HomeClienteActivity.class));
//        }
//    }


}











