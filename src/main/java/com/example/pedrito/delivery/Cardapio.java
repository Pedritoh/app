package com.example.pedrito.delivery;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pedrito.model.CardapioModel;
import com.example.pedrito.model.ClienteModel;

import java.lang.reflect.Array;

public class Cardapio extends AppCompatActivity {

    private ListView listaCardapio;
    private String[] cardapio ={
            "Al Caponi                             R$ 31,00",
            "Alho e Oléo e Bacon                   R$ 32,00",
            "Quatro Queijos",
            "Cinco Queijos",
            "Atum",
            "Bacon",
            "Baiana",
            "Bologna",
            "Brócolis",
            "Brócolis com Alho e Azeite de Oliva",
            "Calabresa com Catupiry",
            "Calabresa Tradicional",
            "Catupiry",
            "Champignon com Catupiry",
            "Chilena",
            "Crocante",
            "Escarola",
            "Frango",
            "Frango com Catupiry",
            "Frango Light",
            "lombo com Catupiry",
            "Margherita",
            "Milho Verde",
            "Mussarela",
            "Napoli in Calábria",
            "Napolitana",
            "Mineira",
            "Moda da Casa",
            "Portuguesa",
            "Panzerotti",
            "Peruana",
            "Tomate Seco",
            "tradicional"};







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        listaCardapio = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                cardapio);




        listaCardapio.setAdapter(adaptador);

        listaCardapio.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               int posicao = position;

                Toast.makeText(getApplicationContext(),cardapio[posicao], Toast.LENGTH_SHORT).show();


            }
        });
    }
}
