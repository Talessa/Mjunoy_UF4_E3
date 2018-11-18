package com.UF4_E3.Mjunoy.Ex3;

import java.time.LocalDate;
import java.time.Period;

public class Alimentacion extends Producto {

    LocalDate fechaCaducidad;

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setPrecio(float precio) {
         LocalDate hoy = LocalDate.now();
         Period diferencia = Period.between(fechaCaducidad,hoy);
         int dif = diferencia.getDays();

        this.precio = precio - (float) (precio*(1/(dif+1)) + (precio*(0.1)));;
    }


}
