package org.cursodesarrollo.appFacturas.modelo;

public class ItemFactura {

    private Producto producto;
    private int cantidad;

    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /***********METODOS****************/
    public double CantidadImporte(){
        return 0;
    }
}
