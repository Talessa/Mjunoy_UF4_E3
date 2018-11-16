package com.UF4_E3.Mjunoy.Ex3;

import java.time.LocalDate;

public class Alimentacion extends Producto {

    LocalDate fechaCaducidad;

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setPrecio(float precio) {

        this.precio = precio;
    }


}
