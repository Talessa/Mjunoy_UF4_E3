package com.UF4_E3.Mjunoy.Ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<Integer,Integer> frequencia = new HashMap<>();
        int d1;
        int d2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantas veces quieres lanzar los dados? ");
       int lanzamientos = scanner.nextInt();

        for(int i=0; i<lanzamientos; i++) {
            int j = i+1;
            System.out.print("Lanzamiento nº"+j+" ");
            d1 = (int) (Math.random()*6) + 1;
            System.out.print(d1);
            d2 = (int) (Math.random()*6) + 1;
            System.out.println(d1+" + "+d2+" = "+(d1+d2));
            if(frequencia.containsKey(d1+d2)){
                frequencia.put(d1+d2,frequencia.get(d1+d2)+1);
            }
            else{
                frequencia.put(d1+d2,1);
            }
        }

        System.out.println("La frecuencia de los lanzamientos a sido:");
        System.out.println("| Numero | Frecuencia |");
        for(Map.Entry<Integer,Integer> entry: frequencia.entrySet()) {
            System.out.println("   "+entry.getKey() + "          " + entry.getValue());
        }


    }
}
