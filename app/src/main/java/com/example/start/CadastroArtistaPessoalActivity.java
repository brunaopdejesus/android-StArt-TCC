package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class CadastroArtistaPessoalActivity extends AppCompatActivity {

    private int mDay, mMonth, mYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_artista_pessoal);

        final ImageView arrowBack = findViewById(R.id.image_back_cadastro_artista_pessoal);
        final EditText etNome = findViewById(R.id.et_nome_cadastro_artista);
        final EditText etDataNascimento = findViewById(R.id.et_data_nascimento_cadastro_artista);
        final EditText etTelefone = findViewById(R.id.et_telefone_cadastro_artista);
        final EditText etCpfCnpj = findViewById(R.id.et_cpf_cadastro_artista);
        final TextView tvJaPossuiConta = findViewById(R.id.tv_ja_possui_conta_cadastro_artista);
        final Button btnContinuar = findViewById(R.id.btn_continuar_cadastro_artista_pessoal);

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(CadastroArtistaPessoalActivity.this, TipoCadastroActivity.class));
        });

        tvJaPossuiConta.setOnClickListener(view -> {
            startActivity(new Intent(CadastroArtistaPessoalActivity.this, LoginActivity.class));
        });

        etDataNascimento.setOnClickListener(view -> {

            if (view == etDataNascimento) {
                final Calendar c = Calendar.getInstance();
                mDay = c.get(Calendar.DAY_OF_MONTH);
                mMonth = c.get(Calendar.MONTH);
                mYear = c.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                etDataNascimento.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        btnContinuar.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), CadastroArtistaPagamentoPixActivity.class);
            intent.putExtra("nome", etNome.getText().toString());
            intent.putExtra("dataNascimento", etDataNascimento.getText().toString());
            intent.putExtra("telefone", etTelefone.getText().toString());
            intent.putExtra("cpf", etCpfCnpj.getText().toString());
            startActivity(intent);
        });

    }
}