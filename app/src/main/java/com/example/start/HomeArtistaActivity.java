package com.example.start;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeArtistaActivity extends AppCompatActivity {

    private TextView tv_acessar_perfil;
    private ImageView img_acessar_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_artista);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.page_home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.page_add_obra:
                        startActivity(new Intent(getApplicationContext(), AdicionarObraActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.page_home:
                        startActivity(new Intent(getApplicationContext(), HomeArtistaActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.page_profile:
                        startActivity(new Intent(getApplicationContext(), PerfilArtistaActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

//        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
//            @Override
//            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
//                switch (menuItem.getItemId()) {
//                    case R.id.page_add_obra:
//                        startActivity(new Intent(getApplicationContext(), AdicionarObraActivity.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.page_home:
//                        startActivity(new Intent(getApplicationContext(), HomeArtistaActivity.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.page_profile:
//                        startActivity(new Intent(getApplicationContext(), PerfilArtistaActivity.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                }
//                return false;
//            }
//        });

        tv_acessar_perfil = findViewById(R.id.tv_acessar_perfil_artista);
        img_acessar_perfil = findViewById(R.id.iv_acessar_perfil_artista);

        tv_acessar_perfil.setOnClickListener(view -> {
            startActivity(new Intent(HomeArtistaActivity.this, PerfilArtistaActivity.class));
        });

        img_acessar_perfil.setOnClickListener(view -> {
            startActivity(new Intent(HomeArtistaActivity.this, PerfilArtistaActivity.class));
        });

    }
}