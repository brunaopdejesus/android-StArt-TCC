package com.example.start;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

//import com.example.start.util.setDate;

import java.util.Calendar;
import java.util.Date;

public class CadastroClientePessoalActivity extends AppCompatActivity {

//    private ImageView arrowBack;
//    private EditText txtNome;
//    private EditText dtDataNascimento;
//    private EditText txtTelefone;
//    private EditText txtCpf;
//    private TextView txtJaPossuiConta;
//    private Button btnContinuar;
    private int mDay, mMonth, mYear;


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

        arrowBack.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClientePessoalActivity.this, TipoCadastroActivity.class));
        });

        tvJaPossuiConta.setOnClickListener(view -> {
            startActivity(new Intent(CadastroClientePessoalActivity.this, LoginActivity.class));
        });

        etDataNascimento.setOnClickListener(view -> {

            if (view == etDataNascimento) {
                final Calendar c = Calendar.getInstance();
                mDay = c.get(Calendar.DAY_OF_MONTH);
                mMonth = c.get(Calendar.MONTH);
                mYear = c.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                        (view1, year, monthOfYear, dayOfMonth) -> etDataNascimento.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year), mDay, mMonth, mYear);
                datePickerDialog.show();
            }

        });

        btnContinuar.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), CadastroClienteEnderecoActivity.class);
            intent.putExtra("nome", etNome.getText().toString());
            intent.putExtra("dataNascimento", etDataNascimento.getText().toString());
            intent.putExtra("telefone", etTelefone.getText().toString());
            intent.putExtra("cpf", etCpfCnpj.getText().toString());
            startActivity(intent);
        });

    }
}