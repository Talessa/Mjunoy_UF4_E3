package com.UF4_E3.Mjunoy.Ex2;

public class JocDeDaus {

    Dau dau1 ;
    Dau dau2;
    Dau dau3 ;

    public JocDeDaus(){
        dau1 = new Dau();
        dau2 = new Dau();
        dau3 = new Dau();
    }

    public boolean Jugar(int contador){

        boolean partida= false;

        dau1.tirar();
        dau2.tirar();
        dau3.tirar();

        if (dau1.retornarValor() == dau2.retornarValor()
                && dau1.retornarValor() == dau3.retornarValor()
                && dau2.retornarValor() == dau3.retornarValor()){
            partida= true;
        }

        System.out.println("Partida " + contador);
        System.out.print("Dau 1: ");
        dau1.imprimir();
        System.out.print("Dau 2: ");
        dau2.imprimir();
        System.out.print("Dau 3: ");
        dau3.imprimir();

        if (partida){
            System.out.println("Has ganado");
        }else{
            System.out.println("La proxima vez sera");
        }

        return partida;
    }

}
