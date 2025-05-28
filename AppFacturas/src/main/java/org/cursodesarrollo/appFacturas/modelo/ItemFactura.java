package org.cursodesarrollo.appFacturas.modelo;

public class ItemFactura {

    private Producto producto;
    private int cantidad;

    public ItemFactura( int cantidad, Producto producto) {
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
    public float CantidadImporte(){
        return this.cantidad * this.producto.getPrecio(); //calculamos la cantidad * precio
    }
}
