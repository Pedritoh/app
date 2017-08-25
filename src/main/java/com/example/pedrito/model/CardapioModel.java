package com.example.pedrito.model;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Pedrito on 02/06/2017.
 */

public class CardapioModel {

    private SQLiteDatabase bancoDados;


    static public String produtos = "CREATE TABLE IF NOT EXISTS produtos (id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "nome VARCHAR, descricao VARCHAR(110),valor double)";


    static public String insereProdutos =
            "INSERT INTO produtos (nome,descricao,valor) VALUES " +
                    "('Al Caponi','no descrition','R$31,00')," +
                    "('Alho e Oléo e Bacon','no descrition','R$31,50'),"+
                    "('Quatro Queijos','no descrition','R%32,00'),"+
                    "('Cinco Quejos','no descrition','R$32,50'),"+
                    "('Atum','no descrition','R$33,00'),"+
                    "('Bacon','no descrition','R$33,50')";

    static public String recuperaProdutos =
            "SELECT * FROM produtos";


}
