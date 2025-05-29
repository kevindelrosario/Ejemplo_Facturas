package org.cursodesarrollo.appFacturas.modelo;

public class Producto {
    private int codigo;
    private String nombre;
    private float precio;
    private static int ultimoCodigo; //para auto incrementar el codigo

    public Producto() {
        this.codigo = ++ultimoCodigo;
    }


    public int getCodigo() { //El codigo solo se podra leer, ya que se creara automaticamente.
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo +
                "\t" + nombre +
                "\t" + precio;
    }
}
