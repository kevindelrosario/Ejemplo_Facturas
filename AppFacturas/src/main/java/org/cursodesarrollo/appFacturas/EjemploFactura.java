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

        //factura
        System.out.println("Ingrese una descripcion de la factura: ");
        Factura factura = new Factura(s.nextLine(),cliente);

        //Producto

        Producto producto;


        for (int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n# "+ producto.getCodigo()+ ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio( s.nextFloat());

            System.out.print("Ingrese cantidad: ");
           // ItemFactura item = new ItemFactura(s.nextInt(),producto); //vamos ingresando los productos y sus cantidades
            factura.addItemFactura( new ItemFactura(s.nextInt(),producto));//lo agregamos (de esta forma ahorramos codigo)
            System.out.println(); //salto de linea
            s.nextLine(); //simplemente evita que se rompa el codigo por el .nextline de la variable nombre
        }

       // System.out.println(factura.generarDetalle()); //mostramos la informacion al finalizar
        System.out.println(factura);//ya simplemente tenemos que imprimir factura (muestra el toString())
        s.close();
    }
}
