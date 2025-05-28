package org.cursodesarrollo.appFacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio; //id
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items; //arreglo para crear la relacion uno a muchos
    private int indiceItems; //Lo utilizaremos para agregar los items
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio; //para obtener el ultimo folio y luego ir incrementandolo


    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS]; //lo iniciamos con un maximo de 12
        this.folio = ++ultimoFolio; //se agrega un numero mas al ultimo folio
        this.fecha = new Date(); //cuando se crea la factura toma la fecha actual
    }

    public int getFolio() {//solo se podra leer, no modificar
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() { //solo necesitamos el metodo get para agregar items
        return items;
    }

    /******* METODOS  *********/

    /**
     * Agrega items
     *
     * @param item
     */
    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) { //mientras sea menor a 12 podra seguir agregando.
            this.items[indiceItems++] = item; //tenemos que inicializar el arreglo para evitar la excepcion por ser null.
        }
    }

    /**
     * Calcular total
     * suma todos los items
     *
     * @return cantidad total de los importes
     */
    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) { //recorre los items y los va sumando
            if (item == null) {
                continue; //cuando sea null cerrara, para no contar los espacios vacios
            }
            total += item.CantidadImporte();
        }
        return total;
    }

    /**
     * Generar Detalles de la factura
     * @return StringBuilder sb: detalles del pedido
     */
    public String generarDetalle() {
        //para concatenar varios valores
        StringBuilder sb = new StringBuilder("Factura N# : "); //para concatenar de una forma mas limpia
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n");


        SimpleDateFormat df = new SimpleDateFormat("dd 'de ' MMM, yyyy"); //formato de la fecha
        sb.append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n");
        sb.append("\n#\tNombre\tCant.\tTotal\n");
        for (ItemFactura item: this.items){
            if(item == null){
                continue;
            }
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.CantidadImporte())
                    .append("\n");
        }

        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

}
