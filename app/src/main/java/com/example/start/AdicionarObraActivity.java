package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.start.R;
import com.example.start.model.Obra;
import com.example.start.remote.RouterInterface;

public class AdicionarObraActivity extends AppCompatActivity {

    RouterInterface routerInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_obra);

        final EditText et_titulo = findViewById(R.id.et_titulo_adicionar_obra);
        final EditText et_descricao = findViewById(R.id.descricao_adicionar_obra);
        final EditText et_quantidade = findViewById(R.id.et_quantidade_adicionar_obra);
        final EditText et_preco = findViewById(R.id.et_preco_adicionar_obra);
        final EditText et_desconto = findViewById(R.id.et_desconto_adicionar_obra);
        final EditText et_exclusividade = findViewById(R.id.et_exclusividade_adicionar_obra);
        final EditText et_tecnica = findViewById(R.id.et_tecnica_adicionar_obra);
        final EditText et_categoria = findViewById(R.id.et_categoria_adicionar_obra);
        final EditText et_subcategoria = findViewById(R.id.et_subcategoria_adicionar_obra);
        final Button btnCadastrarObra = findViewById(R.id.btn_adicionar_obra);

        btnCadastrarObra.setOnClickListener(view -> {

            Obra obra = new Obra();

            obra.setNomeObra(et_titulo.getText().toString());
//            obra.setPreco(et_preco.getText().toString());
//            obra.setQuantidade(et_quantidade.getText().toString());
            obra.setNomeObra(et_titulo.getText().toString());
            obra.setNomeObra(et_titulo.getText().toString());
            obra.setNomeObra(et_titulo.getText().toString());
            obra.setNomeObra(et_titulo.getText().toString());

            obra.setPreco(2);
            obra.setQuantidade(5);


        });

    }
}