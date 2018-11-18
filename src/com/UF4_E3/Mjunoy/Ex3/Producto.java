package com.UF4_E3.Mjunoy.Ex3;

public class Producto {

    String nombre;
    float precio;
    int codigoBarras;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {

        this.codigoBarras = codigoBarras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto producto = (Producto) o;

        if (Float.compare(producto.precio, precio) != 0) return false;
        return codigoBarras == producto.codigoBarras;
    }

    @Override
    public int hashCode() {
        int result = (precio != +0.0f ? Float.floatToIntBits(precio) : 0);
        result = 31 * result + codigoBarras;
        return result;
    }
}
