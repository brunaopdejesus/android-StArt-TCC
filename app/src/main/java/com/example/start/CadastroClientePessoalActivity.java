package com.example.start;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

//import com.example.start.util.setDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CadastroClientePessoalActivity extends AppCompatActivity {

    private int mDay, mMonth, mYear;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mypref_cliente";
    private static final String NOME_COMPLETO_CLIENTE = "nomeCompleto";
    private static final String DATA_NASCIMENTO_CLIENTE = "dataNascimento";
    private static final String TELEFONE_CLIENTE = "telefone";
    private static final String CPF_CNPJ_CLIENTE = "cpfCnpj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_pessoal);

        final ImageView arrowBack = findViewById(R.id.image_back_cadastro_cliente_pessoal);
        final EditText etNome = findViewById(R.id.et_nome_cadastro_cliente);
        final EditText etDataNascimento = findViewById(R.id.et_data_nascimento_cadastro_cliente);
//            setDate fromDate = new setDate(etDataNascimento, this);
        final EditText etTelefone = findViewById(R.id.et_telefone_cadastro_cliente);
        final EditText etCpfCnpj = findViewById(R.id.et_cpf_cadastro_cliente);
        final TextView tvJaPossuiConta = findViewById(R.id.tv_ja_possui_conta_cadastro_cliente);
        final Button btnContinuar = findViewById(R.id.btn_continuar_cadastro_cliente_pessoal);
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClientePessoalActivity.this, TipoCadastroActivity.class));
        });

        tvJaPossuiConta.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClientePessoalActivity.this, LoginActivity.class));
        });

        etDataNascimento.setOnClickListener(view -> {

            if (view == etDataNascimento) {
                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                        (view1, year, monthOfYear, dayOfMonth) -> etDataNascimento.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth), mDay, mMonth, mYear);
                datePickerDialog.show();
            }

        });

        btnContinuar.setOnClickListener(view -> {

            if (TextUtils.isEmpty(etNome.getText().toString())) {
                etNome.setError("Insira seu nome");
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                return;

            }

//            if (TextUtils.isEmpty(etDataNascimento.getText().toString())) {
//                etDataNascimento.setError("Insira sua data de nascimento");
//                return;
//            }

            if (TextUtils.isEmpty(etTelefone.getText().toString())) {
                etTelefone.setError("Insira seu telefone");
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();

                return;
            }

            if (TextUtils.isEmpty(etCpfCnpj.getText().toString())) {
                etCpfCnpj.setError("Insira seu CPF ou CPNJ");
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();

                return;
            }


            // when click a button put data on SharedPreferences
            SharedPreferences.Editor editor = sharedPreferences.edit();



            // putting data
            editor.putString(NOME_COMPLETO_CLIENTE,etNome.getText().toString());
            editor.putString(DATA_NASCIMENTO_CLIENTE,etDataNascimento.getText().toString());
            editor.putString(TELEFONE_CLIENTE,etTelefone.getText().toString());
            editor.putString(CPF_CNPJ_CLIENTE,etCpfCnpj.getText().toString());
            editor.apply();

            // start next activity
            startActivity(new Intent(CadastroClientePessoalActivity.this, CadastroClienteEnderecoActivity.class));

            // just to be sure rsrs
//                Toast.makeText(CadastroArtistaPessoalActivity.this, "Inserted on SharedPref", Toast.LENGTH_SHORT).show();

        });

    }
}














