package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
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
import com.example.start.remote.RetrofitClient;
import com.example.start.remote.RouterInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CadastroClienteEnderecoActivity extends AppCompatActivity {

    RouterInterface routerInterface;

    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mypref_cliente";
    private static final String CEP = "cep";
    private static final String ENDERECO = "endereco";
    private static final String NUMERO = "numero";
    private static final String COMPLEMENTO = "complemento";
    private static final String BAIRRO = "bairro";
    private static final String ESTADO = "estado";
    private static final String CIDADE = "cidade";

    private Spinner spinnerEstado, spinnerCidade;
    private ArrayList<String> getstateName=new ArrayList<String>();

    private ImageView arrowBack;
    private EditText txtCep;
    private EditText txtEndereco;
    private EditText txtNumero;
    private EditText txtComplemento;
    private EditText txtBairro;
    private Spinner spEstados;
    private Spinner spCidades;
    private Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_endereco);

        routerInterface = APIUtil.getUsuarioInterface();
        getStates();

        spinnerEstado=(Spinner)findViewById(R.id.sp_estado_cadastro_cliente);
        spinnerCidade=(Spinner)findViewById(R.id.sp_cidade_cadastro_endereco);

        arrowBack = findViewById(R.id.image_back_cadastro_cliente_endereco);
        txtCep = findViewById(R.id.et_cep_cadastro_cliente);
        txtEndereco = findViewById(R.id.et_endereco_cadastro_cliente);
        txtNumero = findViewById(R.id.et_numero_cadastro_endereco);
        txtComplemento = findViewById(R.id.et_complemento_cadastro_endereco);
        txtBairro = findViewById(R.id.et_bairro_cadastro_cliente);
        spEstados = findViewById(R.id.sp_estado_cadastro_cliente);
        spCidades = findViewById(R.id.sp_cidade_cadastro_endereco);
        btnContinuar = findViewById(R.id.btn_continuar_cadastro_cliente_endereco);
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        arrowBack.setOnClickListener(view -> {
            finish();
            super.onBackPressed();
        });

        btnContinuar.setOnClickListener(view -> {

            // when click a button put data on SharedPreferences
            SharedPreferences.Editor editor = sharedPreferences.edit();

            // putting data
            editor.putString(CEP,txtCep.getText().toString());
            editor.putString(ENDERECO,txtEndereco.getText().toString());
            editor.putString(NUMERO,txtNumero.getText().toString());
            editor.putString(COMPLEMENTO,txtComplemento.getText().toString());
            editor.putString(BAIRRO,txtBairro.getText().toString());
            editor.putString(ESTADO,spEstados.getSelectedItem().toString());
            editor.putString(CIDADE,spCidades.getSelectedItem().toString());
            editor.apply();

            // start next activity
            startActivity(new Intent(CadastroClienteEnderecoActivity.this, CadastroClienteAcessoActivity.class));


        });

    }

    private void getStates() {

        Call<String> call = routerInterface.getStates();
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