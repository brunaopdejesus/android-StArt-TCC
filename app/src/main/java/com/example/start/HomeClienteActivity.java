package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.start.R;

public class HomeClienteActivity extends AppCompatActivity {

    TextView txtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cliente);

        txtUsername = (TextView) findViewById(R.id.tv_home_cliente_nome);

        Bundle extras = getIntent().getExtras();
        String email;

        if(extras != null){
            email = getIntent().getExtras().getString("email");
            txtUsername.setText("Welcome " + email);
        }

    }
}