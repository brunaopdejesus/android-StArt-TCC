package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.start.R;

public class BoasVindasArtista1Activity extends AppCompatActivity {

    private ImageView arrowSeguinte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas_artista1);

        arrowSeguinte = findViewById(R.id.arrow_continuar_boasvindas_artista1);

        arrowSeguinte.setOnClickListener(view -> {
            startActivity(new Intent(BoasVindasArtista1Activity.this, BoasVindasArtista2Activity.class));
        });

    }
}