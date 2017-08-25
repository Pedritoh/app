package com.example.pedrito.delivery;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conexao {
    // criar função postDados
    public static String postDados(String urlUsuario, String parametroUsuario) {


        URL url; // declarar varial url

        HttpURLConnection connection = null; //fazer a conexao

        try {
/*
            url = new URL(urlUsuario); // mascarei a url pelo usuario

            connection = (HttpURLConnection) url.openConnection(); //abrir a conexao

            //metodo
            connection.setRequestMethod("POST");

            //tipo de conexao - formulario
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            //tamanho da informacao enviada
            connection.setRequestProperty("Content-Lenght", "" + Integer.toString(parametroUsuario.getBytes().length));

            //idioma da comunicacao
            connection.setRequestProperty("Content-Language", "pt-BR");

            connection.setUseCaches(false); //nao armazena
            connection.setDoInput(true); //envio de dados
            connection.setDoOutput(true); //recepção de dados

            //DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
            //dataOutputStream.writeBytes(parametrosUsuario);
            //dataOutputStream.flush();
            //dataOutputStream.close();


            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            outputStreamWriter.write(parametroUsuario);
            outputStreamWriter.flush();


            // recebe os dados
            InputStream inputStream = connection.getInputStream();
            //crio um buffereader, para ver se os dados estão de acordo
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

            String linha; //armazenar a linha no while

            StringBuffer resposta = new StringBuffer(); //junta as informações

            while ((linha = bufferedReader.readLine()) != null) {
                resposta.append(linha);
                resposta.append('\r');

            }

            bufferedReader.close();
            return resposta.toString(); */

            URL urlConn = new URL("http://localhost/html/login/logar.php");
            HttpURLConnection urlConnection = (HttpURLConnection)urlConn.openConnection();

            InputStream inputStream = urlConnection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String linha; //armazenar a linha no while
            StringBuffer resposta = new StringBuffer(); //junta as informações

            while ((linha = bufferedReader.readLine()) != null) {
                resposta.append(linha);
                resposta.append('\r');
            }
            bufferedReader.close();
            return resposta.toString();

        } catch (Exception erro) {

            return "Sem retorno";//null;
        } finally {

            if (connection != null) {
                connection.disconnect();
            }

        }
    }

}

