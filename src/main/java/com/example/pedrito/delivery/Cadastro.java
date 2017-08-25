package com.example.pedrito.delivery;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.database.SQLException;
import com.example.pedrito.model.ClienteModel;
import com.example.pedrito.pojo.Cliente;

import java.util.concurrent.Executor;

import javax.xml.validation.Schema;

public class Cadastro extends Activity {

        private Button BotaoCadastro;


    private EditText NomeDigitado;
    private EditText EnderecoDigitado;
    private EditText NumeroDigitado;
    private EditText CidadeDigitado;
    private EditText TelefoneDigitado;
    private EditText EmailDigitado;
    private EditText SenhaDigitado;
    Cliente objCliente;
    SQLiteDatabase Banco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        SQLiteDatabase Banco = openOrCreateDatabase("deliverydb",MODE_PRIVATE, null);


        Banco.execSQL(ClienteModel.createTable);

        //set para enciar os dados
        //get para mostrar os dados
        // Seleciono o EditText e aponto ele para variavel Digitada, e faço o Cast

        NomeDigitado = (EditText) findViewById(R.id.editNomeId);
        EnderecoDigitado = (EditText) findViewById(R.id.editEnderecoId);
        NumeroDigitado = (EditText) findViewById(R.id.editNumeroId);
        CidadeDigitado = (EditText) findViewById(R.id.editCidadeId);
        TelefoneDigitado = (EditText) findViewById(R.id.editTelefoneId);
        EmailDigitado = (EditText) findViewById(R.id.editEmailId);
        SenhaDigitado = (EditText) findViewById(R.id.editSenhaId);


        //Construtor
        objCliente = new Cliente();

        //redirecionando dadas do pojo para aqui.

        // faço cast do botão e escalo com o ID do botão
        BotaoCadastro = (Button) findViewById(R.id.BotaoCadastrarId);

        //Crio Função para atribuir no botão
        BotaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Cadastrar();


            }

        });
    }

    public void Cadastrar(){

        Banco.execSQL("INSERT INTO clientes (nome , endereco, numero, cidade, telefone, email, senha) VALUES " +
         "('"+NomeDigitado+"','"+EnderecoDigitado+"','"+NumeroDigitado+"','"+CidadeDigitado+"','"+TelefoneDigitado+"'," +
                "'"+EmailDigitado+"','"+SenhaDigitado+"')");

        Toast.makeText(Cadastro.this, "Cadastro efetuado !", Toast.LENGTH_LONG).show();
        startActivity(new Intent(Cadastro.this, Tela_login.class));
    }

    private void redirecionar(){

        objCliente.setNome(NomeDigitado.getText().toString());
        objCliente.setEndereco(EnderecoDigitado.getText().toString());
        objCliente.setNumero(NumeroDigitado.getText().toString());
        objCliente.setCidade(CidadeDigitado.getText().toString());
        objCliente.setTelefone(TelefoneDigitado.getText().toString());
        objCliente.setEmail(EmailDigitado.getText().toString());
        objCliente.setSenha(SenhaDigitado.getText().toString());
    }

    // Função para cadastrar tudo que foi digitado nas EditText


}


    /*   public void vizualizarLog(){
           Cursor cursor = Banco.rawQuery("SELECT * FROM clientes",null);

           int indiceColunaNome = cursor.getColumnIndex("nome");
           int indiceColunaEndereco = cursor.getColumnIndex("endereco");
           int indiceColunaNumero = cursor.getColumnIndex("numero");
           int indiceColunaCidade = cursor.getColumnIndex("cidade");
           int indiceColunaTelefone = cursor.getColumnIndex("telefone");
           int indiceColunaEmail = cursor.getColumnIndex("email");
           int indiceColunaSenha = cursor.getColumnIndex("senha");

           cursor.moveToFirst();

           while(cursor != null){

               Log.i("Resultado ","Nome" + cursor.getString(indiceColunaNome));
               Log.i("Resultado ","Endereco" + cursor.getString(indiceColunaEndereco));
               Log.i("Resultado ","Numero" + cursor.getString(indiceColunaNumero));
               Log.i("Resultado ","Cidade" + cursor.getString(indiceColunaCidade));
               Log.i("Resultado ","Telefone" + cursor.getString(indiceColunaTelefone));
               Log.i("Resultado ","Email" + cursor.getString(indiceColunaEmail));
               Log.i("Resultado ","Senha" + cursor.getString(indiceColunaSenha));



               cursor.moveToNext();
           }

            */






