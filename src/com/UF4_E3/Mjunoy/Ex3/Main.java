package com.UF4_E3.Mjunoy.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Producto> carrito = new ArrayList<>();
        boolean salir = false;
        int opcion;
        Menus menu = new Menus();
        System.out.println("Supermercado Superdona");
        do{
            opcion=menu.principal();

            switch (opcion){
                case 1:
                    boolean principal=false;
                    do{
                        int opP = menu.Productos();
                        switch (opP){
                            case 1:
                                Alimentacion productoA = menu.alimentacion();
                                carrito.add(productoA);
                                break;
                            case 2:
                                Electronica productoE = menu.electronica();
                                carrito.add(productoE);
                                break;
                            case 3:
                                Textil productoT = menu.textil();
                                carrito.add(productoT);
                                break;
                            case 4:
                                System.out.println("Volviendo al menu principal");
                                principal=true;
                        }

                    }while (!principal);
                    break;
                case 2:
                    carrito=Cobrar.cobrar(carrito);
                    break;
                case 3:
                    new Carrito().mostrar(carrito);
                    break;

                case 4:
                    System.out.println("Gracias por comprar en Superdona");
                    salir=true;
            }


        }while (!salir);
    }
}
