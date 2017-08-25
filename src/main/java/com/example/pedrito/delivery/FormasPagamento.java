package com.example.pedrito.delivery;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class FormasPagamento extends Activity {

    private CheckBox VisaCredito;
    private CheckBox MasterCredito;
    private CheckBox EloCredito;

    private CheckBox VisaDebito;
    private CheckBox MasterDebito;
    private CheckBox EloDebito;

    private CheckBox Avista;

    private Button prosseguir;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formas_pagamento);


//---------------------------------------------------------------------------


        VisaCredito = (CheckBox) findViewById(R.id.CheckCCVisa);
        MasterCredito = (CheckBox) findViewById(R.id.CheckCCMasterCard);
        EloCredito = (CheckBox)findViewById(R.id.CheckCCElo);

        VisaDebito = (CheckBox) findViewById(R.id.CheckVisaDb);
        MasterDebito = (CheckBox) findViewById(R.id.CheckMasterDb);
        EloDebito = (CheckBox) findViewById(R.id.CheckEloDb);


        Avista = (CheckBox) findViewById(R.id.CheckAvistaId);

        prosseguir = (Button) findViewById(R.id.ButtonProseguir);

//----------------------------------------------------------------------------
      VisaCredito.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(VisaCredito.isChecked()){

                  Toast.makeText(FormasPagamento.this, "Você escolheu a opção Visa Cartão de Crédito", Toast.LENGTH_SHORT).show();

              }

          }
      });

      MasterCredito.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(MasterCredito.isChecked()){
                  Toast.makeText(FormasPagamento.this, "Você escolheu a opção MasterCard Cartão de Crédito", Toast.LENGTH_SHORT).show();
              }
          }
      });

       EloCredito.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(EloCredito.isChecked()){
                   Toast.makeText(FormasPagamento.this, "Você escolheu a opção Elo Cartão de Crédito", Toast.LENGTH_SHORT).show();
               }
           }
       });

//-----------------------------------------------------------------------------------------------------------------

        VisaDebito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(VisaDebito.isChecked()){
                    Toast.makeText(FormasPagamento.this, "Você escolheu a opção Visa Débito ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        MasterDebito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MasterDebito.isChecked()){
                    Toast.makeText(FormasPagamento.this, "Você escolheu a opção MasterCard Débito", Toast.LENGTH_SHORT).show();
                }
            }
        });
        EloDebito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EloDebito.isChecked()){
                    Toast.makeText(FormasPagamento.this, "Você escolheu a opção de Elo Débito", Toast.LENGTH_SHORT).show();
                }
            }
        });
//-----------------------------------------------------------------------------------------------------
        Avista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Avista.isChecked()){
                    Toast.makeText(FormasPagamento.this, "Você escolheu a opção 'Dinheiro',se necessita de Troco, digite no campo abaixo", Toast.LENGTH_LONG).show();
                }
            }
        });



        prosseguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(FormasPagamento.this,Relatorio.class));
            }
        });





























    }
}
