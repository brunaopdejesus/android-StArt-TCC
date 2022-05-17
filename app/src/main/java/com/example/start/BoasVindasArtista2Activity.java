package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.start.R;

public class BoasVindasArtista2Activity extends AppCompatActivity {

    private ImageView arrowAnterior;
    private ImageView arrowSeguinte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas_artista2);

        arrowAnterior = findViewById(R.id.arrow_voltar_boasvindas_artista2);
        arrowSeguinte = findViewById(R.id.arrow_continuar_boasvindas_artista2);

        arrowAnterior.setOnClickListener(view -> {
            startActivity(new Intent(BoasVindasArtista2Activity.this, BoasVindasArtista1Activity.class));
        });


        arrowSeguinte.setOnClickListener(view -> {
            startActivity(new Intent(BoasVindasArtista2Activity.this, BoasVindasArtista3Activity.class));
        });

    }
}