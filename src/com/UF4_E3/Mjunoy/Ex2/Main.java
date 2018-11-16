package com.UF4_E3.Mjunoy.Ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int opcion;
        int partidas=0;
        int ganadas=0;
        int perdidas=0;
        boolean resultado;
        boolean salir = false;

        JocDeDaus jocDeDaus = new JocDeDaus();

        do {
            System.out.println("Que desea hacer");
            System.out.println("1 - Jugar ");
            System.out.println("2 - Salir ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                partidas++;
                resultado = jocDeDaus.Jugar(partidas);

                if (resultado) {
                    ganadas++;
                } else {
                    perdidas++;
                }
            } else {
                System.out.println("Has juado: " + partidas);
                System.out.println("Has ganado: " + ganadas);
                System.out.println("Has perdido: " + perdidas);
                System.out.println("Gracias por jugar");
                salir=true;
            }
        }while (!salir);


    }
}
