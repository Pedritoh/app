package com.example.pedrito.delivery;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Tamanhos extends Activity {

//----------------------------Tamanho------------
    private CheckBox pequeno;
    private CheckBox media;
    private CheckBox grande;


//---------------------------Bordas---------------
    private CheckBox Nenhum;
    private CheckBox Cheedar;
    private CheckBox Catupiry;

//--------------------------Relatório-------------
    private TextView relatorio;
//--------------------------Buttons---------------
    private Button prosseguir;



//Metodo OnCreate --->
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamanhos);


     //--> Cast de variaveis e fazend conexão com os Id's

        pequeno = (CheckBox) findViewById(R.id.pequenoId);
        media = (CheckBox) findViewById(R.id.mediaId);
        grande = (CheckBox) findViewById(R.id.grandeId);
        relatorio = (TextView) findViewById(R.id.relatorioId);
        Nenhum = (CheckBox) findViewById(R.id.NenhumaId);
        Cheedar = (CheckBox) findViewById(R.id.cheedarId);
        Catupiry = (CheckBox) findViewById(R.id.CatupiryId);

     // --> Função mostrar Toast de Apresentação.
        ToastTamanho();






//--------------------------------------------------------------------------------------------------
        // função para seguir para proximo layout

        prosseguir = (Button) findViewById(R.id.buttonProsseguirId);
        prosseguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast para informar que tudo deu certo.
                Toast.makeText(Tamanhos.this,"Selecione um tipo de pizza.", Toast.LENGTH_SHORT).show();
                //inicia a Active.
                startActivity(new Intent(Tamanhos.this, Cardapio.class));
            }
        });

        // nenhum = 0
        // Cheedar = 1
        // Catupity = 2





//-----------------------------------------------------------------------------------------------------------------
       // Funções para quando clicar nos CheckBox's de tamanho de pizza

           pequeno.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   String tamanhoSelecionado1 = "";
                   if (pequeno.isChecked()) {

                       Toast.makeText(Tamanhos.this, "Pequeno", Toast.LENGTH_SHORT).show();
                       tamanhoSelecionado1 += "Tamanho : " + pequeno.getText() + "\n";
                       relatorio.setText(tamanhoSelecionado1);
                   }


               }
           });

           media.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   if (media.isChecked()) {
                       String tamanhoSelecionado2 = "";
                       Toast.makeText(Tamanhos.this, "Media", Toast.LENGTH_SHORT).show();
                       tamanhoSelecionado2 += "Tamanho : " + media.getText() + "\n";
                       relatorio.setText(tamanhoSelecionado2);
                   }
               }
           });

           grande.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   if (grande.isChecked()) {
                       String tamanhoSelecionado3 = "";
                       Toast.makeText(Tamanhos.this, "Grande", Toast.LENGTH_SHORT).show();
                       tamanhoSelecionado3 += "Tamanho : " + grande.getText() + "\n";
                       relatorio.setText(tamanhoSelecionado3);
                   }
               }
           });


//------------------------------------------------------------------------------------------------------------------
            // Funções para quando clicar na opção de borda de pizza


        Nenhum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Nenhum.isChecked()){
                    String BordaSelecionada0 = "";
                    Toast.makeText(Tamanhos.this, "Nenhuma borda" , Toast.LENGTH_SHORT).show();
                    BordaSelecionada0 += "Borda : "+ Nenhum.getText()+ "\n";
                    relatorio.setText(BordaSelecionada0);

                }
            }
        });

        Cheedar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Cheedar.isChecked()){
                    String BordaSelecionada1 = "";
                    Toast.makeText(Tamanhos.this, "Borda de Cheedar Adicionada", Toast.LENGTH_SHORT).show();
                    BordaSelecionada1 += "Borda : " + Cheedar.getText()+ "\n";
                    relatorio.setText(BordaSelecionada1);
                }
            }
        });
        Catupiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Catupiry.isChecked()){
                    String BordaSelecionada2 = "";
                    Toast.makeText(Tamanhos.this, "Borda de Catupiry Adicionada", Toast.LENGTH_SHORT).show();
                    BordaSelecionada2 += "Borda : "+Catupiry.getText()+ "\n";
                    relatorio.setText(BordaSelecionada2);
                }
            }
        });


    }
//-------------------------------------------------------------------------------------------------------------
    public void ToastTamanho(){
        //Mensagem para Escolher tamanho

            Toast.makeText(Tamanhos.this,"Escolha um Tamanho ",Toast.LENGTH_LONG).show();


    }
}

