package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

            String email = txtEmail.getText().toString();
            if (email == null || email.trim().length() == 0) {
                Toast.makeText(LoginActivity.this, "Insira seu e-mail", Toast.LENGTH_SHORT).show();
                return;
            }

            String senha = txtSenha.getText().toString();
            if (senha == null || senha.trim().length() == 0) {
                Toast.makeText(LoginActivity.this, "Insira sua senha", Toast.LENGTH_SHORT).show();
                return;
            }
            routerInterface = APIUtil.getUsuarioInterface();

//            doLogin(email, senha, userType);
//            doLogin(email, senha);

        });

    }

    private boolean validateLogin(String email, String senha){
        if (email == null || email.trim().length() == 0) {
            Toast.makeText(LoginActivity.this, "Insira seu e-mail", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (senha == null || senha.trim().length() == 0) {
            Toast.makeText(LoginActivity.this, "Insira sua senha", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void doLogin(String email, String senha, int userType) {

        routerInterface = APIUtil.getUsuarioInterface();

        if (userType == 0) {

//            if (email)
//            Call<Cliente> loginCliente = routerInterface.loginCliente(email, senha);

            startActivity(new Intent(LoginActivity.this, HomeClienteActivity.class));

        } else if (userType == 1) {
            Call<Artista> loginArtista = routerInterface.loginArtista(email, senha);
            startActivity(new Intent(LoginActivity.this, HomeArtistaActivity.class));
        } else {
            Toast.makeText(this, "Não foi possível realizar o login", Toast.LENGTH_SHORT).show();
        }

    }

}