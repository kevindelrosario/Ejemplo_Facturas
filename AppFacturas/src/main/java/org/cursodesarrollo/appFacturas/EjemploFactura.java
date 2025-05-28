package org.cursodesarrollo.appFacturas;

import org.cursodesarrollo.appFacturas.modelo.Cliente;
import org.cursodesarrollo.appFacturas.modelo.Factura;
import org.cursodesarrollo.appFacturas.modelo.ItemFactura;
import org.cursodesarrollo.appFacturas.modelo.Producto;

import java.util.Scanner;

//clase principal de la app
public class EjemploFactura {
    public static void main(String[] args) {
        //Creacion de cliente de ejemplo:
        Cliente cliente = new Cliente();

        cliente.setNif("fff5");
        cliente.setNombre("kevin");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        String desc = s.nextLine();

        //factura
        Factura factura = new Factura(desc,cliente);

        //Producto

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        for (int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n# "+ producto.getCodigo()+ ": ");
            nombre = s.nextLine();
            producto.setNombre(nombre);
            System.out.print("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);
            System.out.print("Ingrese cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad,producto); //vamos ingresando los productos y sus cantidades
            factura.addItemFactura(item);//lo agregamos
            System.out.println(); //salto de linea
            s.nextLine(); //simplemente evita que se rompa el codigo por el .nextline del nombre 
        }

        System.out.println(factura.generarDetalle()); //mostramos la informacion al finalizar
        s.close();
    }
}
