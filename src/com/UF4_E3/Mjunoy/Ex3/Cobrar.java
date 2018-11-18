package com.UF4_E3.Mjunoy.Ex3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cobrar {

    public static List cobrar(List<Producto> productos){

        float preciopF = 0;

        Map<Producto,Integer> produclist = new HashMap<>();

        for (Producto producto : productos) {
            if (produclist.containsKey(producto)) {
                produclist.put(producto, produclist.get(produclist.get(producto))+1);
            }else{
                produclist.put(producto,1);
            }
            preciopF += producto.getPrecio();
        }

        LocalDate hoy = LocalDate.now();

        System.out.println("--------------------------");
        System.out.println("        Superdona        ");
        System.out.println(hoy);
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("nombre -> Cantidad -> precio -> Total");
        System.out.println();

        for(Map.Entry<Producto,Integer> entry: produclist.entrySet()) {
            Producto producto = entry.getKey();
            float precio=(float)producto.getPrecio()*entry.getValue();
            System.out.println(producto.getNombre()+" -> "+entry.getKey()+" -> "+producto.getPrecio()+"->" +precio);
        }
        System.out.println("--------------------------");
        System.out.println("       Precio final       ");
        System.out.println("      "+preciopF);
        System.out.println("--------------------------");

        productos.clear();


        return productos;
    }
}
