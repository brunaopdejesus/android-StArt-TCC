package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.start.R;
import com.example.start.model.Obra;
import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdicionarObraActivity extends AppCompatActivity {

    RouterInterface routerInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_obra);

        final EditText et_titulo = findViewById(R.id.et_titulo_adicionar_obra);
        final EditText et_descricao = findViewById(R.id.descricao_adicionar_obra);
        final EditText et_quantidade = findViewById(R.id.et_quantidade_adicionar_obra);
        final EditText et_preco = findViewById(R.id.et_preco_adicionar_obra);
        final EditText et_desconto = findViewById(R.id.et_desconto_adicionar_obra);
        final EditText et_exclusividade = findViewById(R.id.et_exclusividade_adicionar_obra);
        final EditText et_tecnica = findViewById(R.id.et_tecnica_adicionar_obra);
        final EditText et_categoria = findViewById(R.id.et_categoria_adicionar_obra);
        final EditText et_subcategoria = findViewById(R.id.et_subcategoria_adicionar_obra);
        final Button btnCadastrarObra = findViewById(R.id.btn_adicionar_obra);

        btnCadastrarObra.setOnClickListener(view -> {

            Obra obra = new Obra();

            obra.setNomeObra(et_titulo.getText().toString());
//            obra.setPreco(et_preco.getText().toString());
//            obra.setQuantidade(et_quantidade.getText().toString());
            obra.setTecnica(et_tecnica.getText().toString());
//            obra.setDesconto(et_desconto.getText().toString());
//            obra.seteExclusiva(et_exclusividade.getText().toString());
            obra.setDescricao(et_descricao.getText().toString());
//            obra.setIdArtista(.getText().toString());
//            obra.setIdEspecialidade(.getText().toString());
//            obra.setImagem1obrigatoria(.getText().toString());

            obra.setPreco(2);
            obra.setQuantidade(5);
            obra.setDesconto(0.5F);
            obra.seteExclusiva(0);
            obra.setIdArtista(14);
            obra.setIdEspecialidade(2);
            obra.setImagem1obrigatoria("imagem");

            routerInterface = APIUtil.getUsuarioInterface();
            addObra(obra);

        });

    }

    private void addObra(Obra obra) {

        Call<Obra> call = routerInterface.addObra(obra);

        call.enqueue(new Callback<Obra>() {
            @Override
            public void onResponse(Call<Obra> call, Response<Obra> response) {
                Log.d("TESTE-", "TESTE2 CADASTRO ARTISTA");
                Log.d("TESTE-", String.valueOf(response.isSuccessful()));
                Toast.makeText(AdicionarObraActivity.this, "Obra cadastrada com sucesso", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Obra> call, Throwable t) {
                Log.d("TESTE-", "TESTE3");
                Log.d("Erro-API", t.getMessage());
            }
        });

    }
}