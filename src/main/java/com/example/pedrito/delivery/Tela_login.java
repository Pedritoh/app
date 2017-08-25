package com.example.pedrito.delivery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pedrito.model.ClienteModel;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Tela_login extends Activity {

    private Button btnLogar;

    String url = "";
    String parametros = "";
    String digitado ="";

    private EditText EmailDigitado;
    private EditText SenhaDigitado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

    //    textCadastrar = (Button) findViewById(R.id.irCadastro);
        EmailDigitado = (EditText) findViewById(R.id.login_id);
        SenhaDigitado = (EditText) findViewById(R.id.senha_id);
        btnLogar = (Button) findViewById(R.id.botao_Logar);

        digitado = "email=" +EmailDigitado+ "$senha="+SenhaDigitado;


        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConnectivityManager connMgr = (ConnectivityManager)
                        getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

                if (networkInfo != null && networkInfo.isConnected()) {

                    String email = EmailDigitado.getText().toString();
                    String senha = SenhaDigitado.getText().toString();



                    if (email.isEmpty() || senha.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "Nenhum campo pode estar vazio", Toast.LENGTH_SHORT).show();
                        }else{

                            url = "http://172.22.3.47//html/login/logar.php";

                            parametros = "email=" + email + "$senha=" + senha;


                            new SolicitaDados().execute(url);
                        }

                } else {
                    Toast.makeText(getApplicationContext(), "Nenhuma conexao foi detectada", Toast.LENGTH_LONG).show();
                }
            }
        });
    }




    private class SolicitaDados extends AsyncTask<String, Void, String>{
        @Override
        protected String doInBackground(String... urls) {

            /*URL urlConn = new URL("http://172.22.3.47/html/login/logar.php");
            HttpURLConnection urlConnection = (HttpURLConnection)urlConn.openConnection();
            try {
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                return readStream(in);
            } finally {
                return "sem resultado";
            }*/

            return Conexao.postDados(urls[0],parametros);
        }

        //onPostExecute
        @Override
        protected  void onPostExecute (String resultado) {
            //retorna dados
            EmailDigitado.setText(resultado);

                    }


    }
}


/*Cadastrar.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
    startActivity(new Intent(Tela_login.this, Cadastro.class));
}

};
*/