package com.example.pedrito.model;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Button;
import android.widget.EditText;

import com.example.pedrito.delivery.Cadastro;
import com.example.pedrito.pojo.Cliente;


/**
 * Created by Pedrito on 01/06/2017.
 */


public class ClienteModel extends Cliente {



    static public String createTable = " CREATE TABLE IF NOT EXISTS clientes (id INTEGER PRIMARY KEY AUTOINCREMENT,nome VARCHAR(110), endereco VARCHAR," +
            "numero INTEGER(6),cidade VARCHAR,telefone INTEGER (36),email VARCHAR (30),senha VARCHAR (30)) ";


 //static public String Inserirtabela = "INSERT INTO clientes (nome , endereco, numero, cidade, telefone, email, senha)" +
     //    " VALUES ('" + NomeDigitado + "'+'" + EnderecoDigitado + "','" + NumeroDigitado + "','" + CidadeDigitado + "','" + TelefoneDigitado + "','" + EmailDigitado + "','" + SenhaDigitado + "')");

   // static public String InsertTable = "INSERT INTO clientes (id ,nome, endereco, numero, cidade ,telefone ,email ,senha ) VALUES (

    static public String dropTable = "DROP TABLE clientes" ;




}
