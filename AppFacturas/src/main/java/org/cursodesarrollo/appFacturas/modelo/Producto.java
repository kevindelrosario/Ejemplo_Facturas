package org.cursodesarrollo.appFacturas.modelo;

public class Producto {
    private int codigo;
    private String nombre;
    private Double precio;
    private static int ultimoCodigo; //para auto incrementar el codigo

    public Producto(int codigo) {
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
