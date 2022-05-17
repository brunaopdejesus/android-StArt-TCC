package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.start.R;
import com.example.start.model.Artista;
import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastroArtistaAcessoActivity extends AppCompatActivity {

    RouterInterface routerInterface;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mypref_artista";
    private static final String NOME_COMPLETO_ARTISTA = "nomeCompleto";
    private static final String NOME_ARTISTICO_ARTISTA = "nomeArtistico";
    private static final String DATA_NASCIMENTO_ARTISTA = "dataNascimento";
    private static final String TELEFONE_ARTISTA = "telefone";
    private static final String CPF_CNPJ_ARTISTA = "cpfCnpj";
    private static final String PIX = "pix";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_artista_acesso);

        final ImageView arrowBack = findViewById(R.id.image_back_cadastro_artista_acesso);
        final EditText etEmail = findViewById(R.id.et_email_cadastro_artista_acesso);
        final EditText etSenha = findViewById(R.id.et_senha_cadastro_artista_acesso);
        final Button btnCadastrar = findViewById(R.id.btn_continuar_cadastro_artista_acesso);
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });

        btnCadastrar.setOnClickListener(view -> {

            if (TextUtils.isEmpty(etEmail.getText().toString())) {
                etEmail.setError("Insira seu e-mail");
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();

                return;
            }

            if (TextUtils.isEmpty(etSenha.getText().toString())) {
                etSenha.setError("Insira sua senha");
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();

                return;
            }

            Artista artista = new Artista();

            artista.setNomeCompleto(sharedPreferences.getString(NOME_COMPLETO_ARTISTA, null));
            artista.setNomeArtistico(sharedPreferences.getString(NOME_ARTISTICO_ARTISTA, null));
            artista.setCpf_cnpj(sharedPreferences.getString(CPF_CNPJ_ARTISTA, null));
            artista.setTelefoneCelular(sharedPreferences.getString(TELEFONE_ARTISTA, null));
            artista.setDataNascimento(sharedPreferences.getString(DATA_NASCIMENTO_ARTISTA, null));

            artista.setPix(sharedPreferences.getString(PIX, null));

            artista.setEmail(etEmail.getText().toString());
            artista.setSenha(etSenha.getText().toString());

            artista.setUserType(1);

            artista.setContaEstaAtiva(1);
            artista.seteDestacado(0);
            artista.setIdEspecialidadeArtista(2);
            artista.setIdEspecialidade(2);

            routerInterface = APIUtil.getUsuarioInterface();
            addArtista(artista);

            startActivity(new Intent(CadastroArtistaAcessoActivity.this, BoasVindasArtista1Activity.class));

        });

    }

    public void addArtista(Artista artista) {

//        Log.d("TESTE-", "TESTE CADASTRO ARTISTA");

        Call<Artista> call = routerInterface.addArtista(artista);

        call.enqueue(new Callback<Artista>() {
            @Override
            public void onResponse(Call<Artista> call, Response<Artista> response) {
//                Log.d("TESTE-", "TESTE2 CADASTRO ARTISTA");
//                Log.d("TESTE-", String.valueOf(response.isSuccessful()));
                Toast.makeText(CadastroArtistaAcessoActivity.this, "Artista cadastrado com sucesso",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Artista> call, Throwable t) {
                Log.d("TESTE-", "TESTE3");
                Log.d("Erro-API", t.getMessage());
            }

        });
    }

}