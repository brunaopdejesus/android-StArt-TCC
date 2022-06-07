package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.start.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cliente);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_cliente);
        bottomNavigationView.setSelectedItemId(R.id.page_home_cliente);

        bottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.page_fav_cliente:
                    startActivity(new Intent(getApplicationContext(), PerfilClienteObrasActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.page_home_cliente:
                    startActivity(new Intent(getApplicationContext(), HomeClienteActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.page_carrinho_cliente:
                    startActivity(new Intent(getApplicationContext(), CarrinhoDeComprasActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.page_profile_cliente:
                    startActivity(new Intent(getApplicationContext(), PerfilClienteActivity.class));
                    overridePendingTransition(0,0);
                    return true;
            }
            return false;
        });

    }
}