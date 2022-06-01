package com.example.start;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.start.R;
import com.example.start.model.Artista;
import com.example.start.model.Item;
import com.example.start.model.Obra;
import com.example.start.remote.APIUtil;
import com.example.start.remote.RouterInterface;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListagemDeObrasClienteActivity extends AppCompatActivity {

    RouterInterface routerInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cliente);

        routerInterface = APIUtil.getUsuarioInterface();

        Call<List<Obra>> call = routerInterface.getObras();
        call.enqueue(new Callback<List<Obra>>() {
            @Override
            public void onResponse(Call<List<Obra>> call, Response<List<Obra>> response) {
                if (response.isSuccessful()) {

                    List<Item> itens = new ArrayList<>();

                    List<Obra> list = new ArrayList<Obra>();
                    list = response.body();

                    for (int i = 0; i < list.size(); i++){
                        itens.add(new Item(0, list.get(i)));
                    }

                    RecyclerView recyclerView = findViewById(R.id.recycler_view_obras);
                    recyclerView.setAdapter(new ObraAdapter(itens));

                }
            }

            @Override
            public void onFailure(Call<List<Obra>> call, Throwable t) {

            }
        });
    }

    private class ObraAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        List<Item> itens;

        public ObraAdapter(List<Item> itens) {
            this.itens = itens;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ObraAdapter.ObraViewHolder(LayoutInflater.from(
                    parent.getContext()).inflate(
                    R.layout.item_container_obra,
                    parent,
                    false));
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            if (getItemViewType(position) == 0) {

                Obra obra = (Obra) itens.get(position).getObject();
                ((ObraAdapter.ObraViewHolder) holder).setObraData(obra);

            }
        }

        @Override
        public int getItemCount() {
            return itens.size();
        }

        public int getItemViewType(int position) {
            return itens.get(position).getType();
        }

        /* CLASSE DE VIEWHOLDER DA RECYCLERVIEW */
        class ObraViewHolder extends RecyclerView.ViewHolder{

            /** ATRIBUTOS DA CLASS ObraViewHolder **/
            private TextView txtTituloObra, txtNomeArtista, txtDescricao, txtPreco;
            private int idObra;

            public ObraViewHolder(@NonNull View itemView) {
                // super chama o método construtor de quem foi herdado
                super(itemView);

                txtTituloObra = itemView.findViewById(R.id.obra_titulo);
                txtNomeArtista = itemView.findViewById(R.id.obra_nome_pintor);
                txtDescricao = itemView.findViewById(R.id.obra_descricao);
                txtPreco = itemView.findViewById(R.id.obra_preco);

                /* AÇÃO DE CLIQUE PARA EDITAR E EXCLUIR OBRA */
//                itemView.setOnClickListener(view -> {
//
//                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(ListagemDeObrasClienteActivity.this)
//                            .setMessage("Escolha a ação que deseja executar 👀🙀")
//                            .setPositiveButton("Editar ✍️", (dialog1, witch)->{
//
//                                Intent intent = new Intent(FeedLivro.this, AlterarLivro.class);
//                                intent.putExtra("cod_livro", cod_livro);
//                                startActivity(intent);
//
//                            })
//                            .setNegativeButton("Excluir ☠️", (dialog2, witch)->{
//
//                                routerInterface = APIUtil.getUsuarioInterface();
//
//                                Call<Livro> call = routerInterface.deleteLivro(cod_livro);
//
//                                // retorno da chamada de call
//                                call.enqueue(new Callback<Livro>() {
//                                    @Override
//                                    public void onResponse(Call<Livro> call, Response<Livro> response) {
//                                        Toast.makeText(FeedLivro.this, "Livro excluído com sucesso 🥳", Toast.LENGTH_SHORT).show();
//                                        startActivity(new Intent(FeedLivro.this, FeedLivro.class));
//                                    }
//
//                                    @Override
//                                    public void onFailure(Call<Livro> call, Throwable t) {
//
//                                    }
//                                });
//
//                            });
//                    alertDialog.show();
//
//                });

            }

            /* MÉTODO QUE CARREGA OS VALORES NOS ELEMENTOS DE TEXTVIEW (txtTitulo; txtDescricao) */
            public void setObraData(Obra obra){

                txtTituloObra.setText(obra.getNomeObra());
//                txtNomeArtista.setText(artista.getNomeArtistico());
                txtDescricao.setText(obra.getDescricao());
                txtPreco.setText((int) obra.getPreco());

            }

        }

    }



}