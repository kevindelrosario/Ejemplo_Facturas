# 🧾 Proyecto: Sistema Básico de Facturación en Java

## 📋 Descripción
Este es un mini proyecto en Java que simula el funcionamiento básico de una factura. Se compone de clases como `Factura`, `Cliente`, `Producto` e `ItemFactura`, y representa cómo podrían gestionarse productos, cantidades y cálculos de totales para generar una factura completa con fecha, cliente e importe total.

![alt text](/Captura%20de%20pantalla%202025-05-29%20120704.png)
![alt text](/Captura%20de%20pantalla%202025-05-29%20120730.png)


> 💡 Incluye un diagrama UML con las relaciones entre las clases para facilitar su comprensión y futuras mejoras.

## 🧱 Arquitectura y Clases Principales

- **Cliente**: Contiene el nombre y NIF del cliente.
- **Producto**: Código, nombre y precio de un producto.
- **ItemFactura**: Relaciona un producto con la cantidad comprada, y permite calcular el importe parcial.
- **Factura**: Asocia al cliente con una lista de `ItemFactura`, e incluye fecha, número de folio, y métodos para calcular el total y mostrar el detalle completo.
- **EjemploFactura (main)**: Clase principal con un menú sencillo en consola que permite:
  - Pedir datos del cliente.
  - Ingresar productos y cantidades mediante un `for`.
  - Generar y mostrar la factura final con todos los detalles usando `StringBuilder`.

## 🖥️ Ejecución
1. Asegúrate de tener Java instalado (JDK 8 o superior).
2. Compila todas las clases:
   ```bash
   javac *.java
   ```
3. Ejecuta la clase principal:
   ```bash
   java EjemploFactura
   ```

## 📈 Diagrama UML
El diagrama UML se encuentra en el archivo `Diagrama UML.html` incluido en el proyecto, y muestra la estructura del sistema con las clases y sus relaciones.

## 🛠️ Posibles mejoras futuras
- Validación de entradas del usuario.
- Reemplazar el `for` por entrada dinámica con bucle `while`.
- Generar una interfaz gráfica con Swing o JavaFX.
- Exponerlo como una API REST usando Spring Boot.
- Exportar la factura a PDF o CSV.
- Persistencia en base de datos (por ejemplo con JDBC o JPA/Hibernate).

## 🧠 Aprendizajes clave
- Principios básicos de POO: encapsulamiento, relaciones entre objetos.
- Organización de clases en un sistema real.
- Uso de `StringBuilder` para generar texto dinámico.
- Manipulación de fechas y entrada por consola.
- Buen punto de partida para escalar hacia sistemas más completos.