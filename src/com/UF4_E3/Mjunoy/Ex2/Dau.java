package com.UF4_E3.Mjunoy.Ex2;

public class Dau {
    int valor;

    public void tirar(){
        valor =(int) (Math.random()*6) + 1;
    }

    public void imprimir(){
        System.out.println(valor);
    }

    public int retornarValor() {
        return valor;
    }
}
