package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_artista_acesso);

        final ImageView arrowBack = findViewById(R.id.image_back_cadastro_artista_acesso);
        final EditText etEmail = findViewById(R.id.et_email_cadastro_artista_acesso);
        final EditText etSenha = findViewById(R.id.et_senha_cadastro_artista_acesso);
        final Button btnCadastrar = findViewById(R.id.btn_continuar_cadastro_artista_acesso);

        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });

        btnCadastrar.setOnClickListener(view -> {

            Artista artista = new Artista();

            artista.setNomeCompleto(getIntent().getExtras().getString("nomeCompleto"));
            artista.setNomeArtistico(getIntent().getExtras().getString("nomeArtistico"));
            artista.setDataNascimento(getIntent().getExtras().getString("dataNascimento"));
            artista.setTelefoneCelular(getIntent().getExtras().getString("telefone"));
            artista.setCpf_cnpj(getIntent().getExtras().getString("cpf"));

            artista.setPix(getIntent().getExtras().getString("pix"));

            artista.setEmail(etEmail.getText().toString());
            artista.setSenha(etSenha.getText().toString());

//            intent.putExtra("spinner_pix", spinnerOpcaoPix.getSelectedItem().toString());
//            intent.putExtra("opcao_pix", etOpcaoPix.getText().toString());

            routerInterface = APIUtil.getUsuarioInterface();
            addArtista(artista);

        });

    }

    public void addArtista(Artista artista) {

        Log.d("TESTE-", "TESTE CADASTRO ARTISTA");

        Call<Artista> call = routerInterface.addArtista(artista);

        call.enqueue(new Callback<Artista>() {
            @Override
            public void onResponse(Call<Artista> call, Response<Artista> response) {
                Log.d("TESTE-", "TESTE2 CADASTRO ARTISTA");
                Log.d("TESTE-", String.valueOf(response.isSuccessful()));
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