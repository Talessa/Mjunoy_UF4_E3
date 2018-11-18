package com.UF4_E3.Mjunoy.Ex3;

import java.time.LocalDate;
import java.util.Scanner;

public class Menus {

    int opcion;

    Scanner scanner = new Scanner(System.in);

    public int principal(){

        System.out.println("Que desea hacer?.");
        System.out.println("1 - Añadir producto.");
        System.out.println("2 - Pasar por caja.");
        System.out.println("3 - Ver carrito.");
        System.out.println("4 - Salir.");

        opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    public int Productos(){

        System.out.println("Que producto desea añadir?.");
        System.out.println("1 - Alimentacion");
        System.out.println("2 - Electronica.");
        System.out.println("3 - Textil.");
        System.out.println("4 - Menu principal.");

        opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    public Alimentacion alimentacion(){

        Alimentacion productoA = new Alimentacion();

        System.out.println("Nombre del producto:");
        productoA.setNombre(scanner.nextLine());

        System.out.println("Codigo de barras:");
        productoA.setCodigoBarras(scanner.nextInt());

        System.out.println("Fecha de caducidad");
        System.out.println("Dia:");
        int dia = scanner.nextInt();
        System.out.println("Mes:");
        int mes = scanner.nextInt();
        System.out.println("Año:");
        int año = scanner.nextInt();
        productoA.setFechaCaducidad(LocalDate.of(año,mes,dia));

        System.out.println("Precio:");
        productoA.setPrecio(scanner.nextFloat());

        scanner.nextLine();

        return productoA;
    }

    public Textil textil(){

        Textil productoT = new Textil();

        System.out.println("Nombre del producto:");
        productoT.setNombre(scanner.nextLine());

        System.out.println("Codigo de barras:");
        productoT.setCodigoBarras(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Composicion textil:");
        productoT.setComposicionTextil(scanner.nextLine());

        System.out.println("Precio:");
        productoT.setPrecio(scanner.nextFloat());

        scanner.nextLine();

        return productoT;
    }

    public Electronica electronica(){

        Electronica productoE = new Electronica();

        System.out.println("Nombre del producto:");
        productoE.setNombre(scanner.nextLine());

        System.out.println("Codigo de barras:");
        productoE.setCodigoBarras(scanner.nextInt());

        System.out.println("Dias de garatia:");
       productoE.setGarantia(scanner.nextInt());

        System.out.println("Precio:");
        productoE.setPrecio(scanner.nextFloat());

        scanner.nextLine();


        return productoE;
    }


}
