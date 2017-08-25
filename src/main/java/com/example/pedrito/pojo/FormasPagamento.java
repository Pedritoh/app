package com.example.pedrito.pojo;

/**
 * Created by Pedrito on 02/06/2017.
 */

public class FormasPagamento {


    private String CartaoCredito;
    private String CartaoDebito;
    private String Dinheiro;


    public String getCartaoCredito() {
        return CartaoCredito;
    }

    public void setCartaoCredito(String cartaoCredito) {
        CartaoCredito = cartaoCredito;
    }

    public String getCartaoDebito() {
        return CartaoDebito;
    }

    public void setCartaoDebito(String cartaoDebito) {
        CartaoDebito = cartaoDebito;
    }

    public String getDinheiro() {
        return Dinheiro;
    }

    public void setDinheiro(String dinheiro) {
        Dinheiro = dinheiro;
    }
}
