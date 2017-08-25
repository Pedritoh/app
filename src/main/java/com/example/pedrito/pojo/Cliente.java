package com.example.pedrito.pojo;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pedrito.delivery.Cadastro;
import com.example.pedrito.delivery.R;
import com.example.pedrito.delivery.Tela_login;
import com.example.pedrito.model.ClienteModel;
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
import java.util.concurrent.Executor;
import javax.xml.validation.Schema;
import java.net.PasswordAuthentication;
import java.text.NumberFormat;



public class Cliente {

    private int id;
    private String nome;
    private String endereco;
    private String numero;
    private String cidade;
    private String telefone;
    private String email;
    private String senha;

    public Cliente() {

    }

    public Cliente(int _id, String _nome, String _endereco, String _numero, String _cidade, String _telefone, String _email, String _senha) {
        this.id = _id;
        this.nome = _nome;
        this.endereco = _endereco;
        this.numero = _numero;
        this.cidade = _cidade;
        this.telefone = _telefone;
        this.email = _email;
        this.senha = _senha;

    }
    public Cliente( String _nome, String _endereco, String _numero, String _cidade, String _telefone, String _email, String _senha) {
        this.nome = _nome;
        this.endereco = _endereco;
        this.numero = _numero;
        this.cidade = _cidade;
        this.telefone = _telefone;
        this.email = _email;
        this.senha = _senha;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
