package com.UF4_E3.Mjunoy.Ex3;

public class Electronica extends Producto {

    int garantia;

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void setPrecio(float precio) {
        this.precio = precio - (float) (precio*(garantia/365)*0.1);
    }
}
