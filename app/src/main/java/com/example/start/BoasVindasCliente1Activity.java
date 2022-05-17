package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.start.R;

public class BoasVindasCliente1Activity extends AppCompatActivity {

    private TextView txtPular;
    private ImageView arrowAnterior;
    private ImageView arrowSeguinte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas_cliente1);

        txtPular = findViewById(R.id.tv_pular_boasvindas_cliente1);
        arrowAnterior = findViewById(R.id.arrow_voltar_boasvindas_cliente1);
        arrowSeguinte = findViewById(R.id.arrow_continuar_boasvindas_cliente1);

        arrowSeguinte.setOnClickListener(view -> {
            startActivity(new Intent(BoasVindasCliente1Activity.this, BoasVindasCliente2Activity.class));
        });

    }
}