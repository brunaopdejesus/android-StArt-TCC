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
import com.example.start.remote.RetrofitClient;
import com.example.start.remote.RouterInterface;

import java.util.concurrent.ConcurrentLinkedDeque;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity {

    RouterInterface routerInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView txtCadastrar = findViewById(R.id.tv_cadastre_login);
        final TextView txtEsqueceuSuaSenha = findViewById(R.id.tv_esqueceu_sua_senha_login);
        final EditText txtEmail = findViewById(R.id.et_email_login);
        final EditText txtSenha = findViewById(R.id.et_senha_login);
        final Button btnEntrar = findViewById(R.id.btn_entrar_login);
        routerInterface = APIUtil.getUsuarioInterface();

        txtCadastrar.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, TipoCadastroActivity.class));
        });

        txtEsqueceuSuaSenha.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, EsqueceuSuaSenhaActivity.class));
        });


        btnEntrar.setOnClickListener(view -> {

            String emailLogin = txtEmail.getText().toString();
            String senhaLogin = txtEmail.getText().toString();

            loginCliente(emailLogin, senhaLogin);

        });

    }
    //49:24
    private void loginCliente(String emailLogin, String senhaLogin) {

        Call<Cliente> call = routerInterface.loginCliente();

        call.enqueue(new Callback<Cliente>() {
            @Override
            public void onResponse(Call<Cliente> call, Response<Cliente> response) {
                startActivity(new Intent(LoginActivity.this, PerfilClienteActivity.class));
            }

            @Override
            public void onFailure(Call<Cliente> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "Pois é, gatinha", Toast.LENGTH_SHORT).show();
            }
        });

    }







}











