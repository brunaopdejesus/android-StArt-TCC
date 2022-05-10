package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.start.model.States;
import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastroClienteEnderecoActivity extends AppCompatActivity {

    RouterInterface routerInterface;

    private Spinner spinnerEstado, spinnerCidade;
    private ArrayList<String> getstateName=new ArrayList<String>();

    private ImageView arrowBack;
    private EditText txtCep;
    private EditText txtEndereco;
    private EditText txtNumero;
    private EditText txtComplemento;
    private EditText txtBairro;
    private Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_endereco);

        routerInterface = APIUtil.getUsuarioInterface();

        spinnerEstado=(Spinner)findViewById(R.id.sp_estado_cadastro_cliente_1);
        spinnerCidade=(Spinner)findViewById(R.id.sp_cidade_cadastro_endereco_2);

        arrowBack = findViewById(R.id.image_back_cadastro_cliente_endereco);
        txtCep = findViewById(R.id.et_cep_cadastro_cliente);
        txtEndereco = findViewById(R.id.et_endereco_cadastro_cliente);
        txtNumero = findViewById(R.id.et_numero_cadastro_endereco);
        txtComplemento = findViewById(R.id.et_complemento_cadastro_endereco);
        txtBairro = findViewById(R.id.et_bairro_cadastro_cliente);
//        txtCidade = findViewById(R.id.sp_cidade_cadastro_endereco_2);
//        spinner = findViewById(R.id.sp_estado_cadastro_cliente);
        btnContinuar = findViewById(R.id.btn_continuar_cadastro_cliente_endereco);

        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });

        spinnerEstado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                getState();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                getState();
            }
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
            intent.putExtra("estado", spinnerEstado.getSelectedItem().toString());
            intent.putExtra("cidade", spinnerCidade.getSelectedItem().toString());
            startActivity(intent);
        });


    }

    private void getState() {

        Call<String> call = routerInterface.getState();
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.i("Response", response.body().toString());

                if (response.isSuccessful()) {
                    if (response.body()!=null){
                        Log.i("Success", response.body().toString());
                        try {
                            String getResponse=response.body().toString();
                            List<States> getstateData=new ArrayList<States>();
                            JSONArray jsonArray=new JSONArray(getResponse);
                            getstateData.add(new States(-1, "Selecione"));

                            for (int i=0; i<jsonArray.length(); i++) {
                                States states = new States();
                                JSONObject jsonObject=jsonArray.getJSONObject(i);
                                states.setIdEstado(jsonObject.getInt("idEstado"));
                                states.setNomeEstado(jsonObject.getString("nomeEstado"));
                                getstateData.add(states);
                            }
                            for (int i=0; i<getstateData.size(); i++) {
                                getstateName.add(getstateData.get(i).getNomeEstado().toString());
                            }
                            ArrayAdapter<String> spinStateAdapter=new ArrayAdapter<String>(
                                    CadastroClienteEnderecoActivity.this,
                                    android.R.layout.simple_spinner_item,
                                    getstateName
                            );
                            spinStateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spinnerEstado.setAdapter(spinStateAdapter);
                            spinnerEstado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                @Override
                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                                }

                                @Override
                                public void onNothingSelected(AdapterView<?> adapterView) {

                                }
                            });
                        }
                        catch (JSONException ex) {
                            ex.printStackTrace();
                        }

                    }
                }

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });

    }


}