package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.start.R;

public class BoasVindasCliente4Activity extends AppCompatActivity {

    private ImageView arrowAnterior;
    private ImageView arrowSeguinte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas_cliente4);

        arrowAnterior = findViewById(R.id.arrow_voltar_boasvindas_cliente4);
        arrowSeguinte = findViewById(R.id.arrow_continuar_boasvindas_cliente4);

        arrowAnterior.setOnClickListener(view -> {
            startActivity(new Intent(BoasVindasCliente4Activity.this, BoasVindasCliente3Activity.class));
        });


        arrowSeguinte.setOnClickListener(view -> {
            startActivity(new Intent(BoasVindasCliente4Activity.this, HomeClienteActivity.class));
        });


    }
}