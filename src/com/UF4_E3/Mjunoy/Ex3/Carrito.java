package com.UF4_E3.Mjunoy.Ex3;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrito {

    public static void mostrar(List<Producto> productos){

        if(!productos.isEmpty()) {

            Map<Integer,Integer> produclist = new HashMap<>();

            for (Producto producto : productos) {
                if (produclist.containsKey(producto.getCodigoBarras())) {
                    produclist.put(producto.getCodigoBarras(), produclist.get(producto.codigoBarras)+1);
                }else{
                    produclist.put(producto.getCodigoBarras(),1);
                }
            }


            System.out.println("CARRITO");
            System.out.println(" Nombre -> cantidad");

            for(Map.Entry<Integer,Integer> entry: produclist.entrySet()) {
               int codigo = entry.getKey();
               for (Producto producto:productos){
                   if (producto.getCodigoBarras() == codigo){
                       System.out.print(producto.getNombre()+" -> ");
                   }
               }
                System.out.println(entry.getValue());

            }

        }else {
            System.out.println("No hay productos en el carrito");
        }


    }


}
