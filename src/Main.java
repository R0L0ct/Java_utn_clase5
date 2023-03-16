import Models.Carrito;
import Models.ItemCarrito;
import Models.Producto;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();

        int i = 0;
        try {
            for (String linea:
                    Files.readAllLines(Paths.get("F:\\Workspace\\Argentina-Programa\\Clase 5\\Clase_5\\src\\file.txt"))
            ){
                System.out.println(linea);
                String nombre = linea.split(",")[0];
                int cantidad = Integer.parseInt(linea.split(",")[1]);
                float precio = Float.parseFloat(linea.split(",")[2]);
                int cuotas = Integer.parseInt(linea.split(",")[3]);
                String codigo = linea.split(",")[4];

                Producto producto = new Producto(nombre,codigo, precio);
                ItemCarrito itemCompra = new ItemCarrito(producto,cantidad,cuotas);

                carrito.getItems()[i] = itemCompra;
                i++;
            }
            System.out.println("Importe total:");
            System.out.println(carrito.costoTotal());
            System.out.println("Hora y fecha de compra:");
            System.out.println(carrito.getLocalDateTime());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}