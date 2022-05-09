package com.example.start;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;
import com.example.start.model.Estado;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastroClienteEnderecoActivity extends AppCompatActivity {

    RouterInterface routerInterface;
    private ImageView arrowBack;
    private EditText txtCep;
    private EditText txtEndereco;
    private EditText txtNumero;
    private EditText txtComplemento;
    private EditText txtBairro;
    private EditText txtCidade;
    private Spinner spinner;
    private Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_endereco);
        addItemsOnSpinner();

        arrowBack = findViewById(R.id.image_back_cadastro_cliente_endereco);
        txtCep = findViewById(R.id.et_cep_cadastro_cliente);
        txtEndereco = findViewById(R.id.et_endereco_cadastro_cliente);
        txtNumero = findViewById(R.id.et_numero_cadastro_endereco);
        txtComplemento = findViewById(R.id.et_complemento_cadastro_endereco);
        txtBairro = findViewById(R.id.et_bairro_cadastro_cliente);
        txtCidade = findViewById(R.id.et_cidade_cadastro_endereco);
//        spinner = findViewById(R.id.sp_estado_cadastro_cliente);
        btnContinuar = findViewById(R.id.btn_continuar_cadastro_cliente_endereco);

        routerInterface = APIUtil.getUsuarioInterface();
        ///////////////////////////////////////////////////
        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });



        btnContinuar.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), CadastroClienteAcessoActivity.class);
            intent.putExtra("nome", intent.getStringExtra("nome"));
            intent.putExtra("dataNascimento", intent.getStringExtra("dataNascimento"));
            intent.putExtra("telefone", intent.getStringExtra("telefone"));
            intent.putExtra("cpf", intent.getStringExtra("cpf"));

            intent.putExtra("cep", txtCep.getText().toString());
            intent.putExtra("endereco", txtEndereco.getText().toString());
//                intent.putExtra("numero", txtNumero.getText().toString());
            intent.putExtra("numero", txtNumero.getText().toString());
            intent.putExtra("complemento", txtComplemento.getText().toString());
            intent.putExtra("bairro", txtBairro.getText().toString());
            intent.putExtra("cidade", txtCidade.getText().toString());
            intent.putExtra("estado", spinner.getSelectedItem().toString());
            startActivity(intent);
        });
    }

    // ADICIONANDO DADOS NO SPINNER
    public void addItemsOnSpinner() {

        spinner = (Spinner) findViewById(R.id.sp_estado_cadastro_cliente);

        Call<List<Estado>> call = routerInterface.getEstados();

        call.enqueue(new Callback<List<Estado>>() {
            @Override
            public void onResponse(Call<List<Estado>> call, Response<List<Estado>> response) {
                List<Estado> EstadoList = response.body();

                if (EstadoList != null && EstadoList.size() > 0) {

                    String[] Estados = new String[EstadoList.size()];

                    for (int i = 0; i < EstadoList.size(); i++) {
                        Estados[i] = EstadoList.get(i).getNomeEstado();

                        ArrayAdapter<String> spinnerArrayEstado =
                                new ArrayAdapter<String>(CadastroClienteEnderecoActivity.this,
                                        android.R.layout.simple_spinner_item,
                                        Estados);
                        spinner.setAdapter(spinnerArrayEstado);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Estado>> call, Throwable t) {

            }
        });

    }


//        Call<List<Estado>> call = routerInterface.getEstados();
//        call.enqueue(new Callback<List<Estado>>() {
//
//            @Override
//            public void onResponse(retrofit2.Call<List<Estado>> call, Response<List<Estado>> response) {
//
//                if (response.isSuccessful()) {
//
//                    List<Estado> estados = new ArrayList<>();
//                    List<Estado> list = new ArrayList<Estado>();
//                    list = response.body();
//
//                    for (int i = 0; i < list.size(); i++) {
//                        estados.add(new Estado(0, list.get(i)));
//                    }
//
//                }
//            }
//
//            @Override
//            public void onFailure(retrofit2.Call<List<Estado>> call, Throwable t) {
//
//            }
//        });




//        spinner.setOnClickListener( view -> {
//            // EXECUTA A CHAMADA PARA A ROTA DE LISTAGEM DE LIVROS
//            retrofit2.Call<List<Estado>> call = routerInterface.getEstados();
//            call.enqueue(new Callback<List<Estado>>() {
//                @Override
//                public void onResponse(retrofit2.Call<List<Estado>> call, Response<List<Estado>> response) {
//
//                        if (response.isSuccessful()) {
//                            List<Estado> estados = new ArrayList<>();
//
//                            // RECEBE OS DADOS DA API
//                            List<Estado> list = new ArrayList<Estado>();
//                            list = response.body();
//
//                            for (int i = 0; i < list.size(); i++) {
//                                estados.add(new Item(0, list.get(i)));
//                            }
//
//                            RecyclerView recyclerView = findViewById(R.id.recycler_view);
//                            recyclerView.setAdapter(new LivroAdapter(itens));
//                }
//
//                @Override
//                public void onFailure(retrofit2.Call<List<Estado>> call, Throwable t) {
//
//                }
//
//        });



}