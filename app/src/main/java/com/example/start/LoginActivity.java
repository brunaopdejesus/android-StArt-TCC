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

import com.example.start.model.Cliente;
import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

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
            String senha = txtSenha.getText().toString();

            if(validateLogin(email, senha) == true){
                //do login
                doLogin(email, senha);
            }

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


    private void doLogin(final String email,final String senha){

        RouterInterface routerInterface = APIUtil.getUsuarioInterface();

        Call<Cliente> call = routerInterface.loginCliente(email, senha);

        // retorno da chamada de call
        call.enqueue(new Callback<Cliente>() {
            @Override
            public void onResponse(Call<Cliente> call, Response<Cliente> response) {

                if(response.isSuccessful()){
                    Cliente resObj = response.body();
                    if(resObj.getMessage().equals("true")){

                        Intent intent = new Intent(LoginActivity.this, HomeClienteActivity.class);
                        intent.putExtra("email", email);
                        startActivity(intent);

                    } else {
                        Toast.makeText(LoginActivity.this, "Os dados estão incorretos, insira-os novamente!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Erro! Tente novamente", Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(LoginActivity.this, "Login realizado com sucesso! 🥳", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, HomeClienteActivity.class));
            }

            @Override
            public void onFailure(Call<Cliente> call, Throwable t) {
                Toast.makeText(LoginActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
//        RouterInterface.loginCliente(email, senha);




        //        call.enqueue(new Callback() {
//            @Override
//            public void onResponse(Call call, Response response) {
//                if(response.isSuccessful()){
//                    ResObj resObj = response.body();
//                    if(resObj.getMessage().equals("true")){
//                        //login start main activity
//                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                        intent.putExtra("username", username);
//                        startActivity(intent);
//
//                    } else {
//                        Toast.makeText(LoginActivity.this, "The username or password is incorrect", Toast.LENGTH_SHORT).show();
//                    }
//                } else {
//                    Toast.makeText(LoginActivity.this, "Error! Please try again!", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call call, Throwable t) {
//                Toast.makeText(LoginActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });

    }

}