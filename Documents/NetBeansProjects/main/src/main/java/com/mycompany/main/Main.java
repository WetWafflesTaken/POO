package com.mycompany.main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Producto P1 = new Producto("", "", "", 0.0, 0.0);
        Producto P2 = new Producto("", "", "", 0.0, 0.0);
        try {
            System.out.println("Introduce los datos del primer producto:");
            System.out.print("Descripcion: ");
            P1.setDescripcion(input.nextLine());
            System.out.print("Codigo: ");
            P1.setCodigo(input.nextLine());
            System.out.print("Tipo: ");
            P1.setTipo(input.nextLine());
            System.out.print("Costo: ");
            P1.setCosto(Double.parseDouble(input.nextLine()));
            System.out.print("Impuesto: ");
            P1.setImpuesto(Double.parseDouble(input.nextLine()));
            System.out.println("Introduce los datos del segundo producto:");
            System.out.print("Descripcion: ");
            P2.setDescripcion(input.nextLine());
            System.out.print("Codigo: ");
            P2.setCodigo(input.nextLine());
            System.out.print("Tipo: ");
            P2.setTipo(input.nextLine());
            System.out.print("Costo: ");
            P2.setCosto(Double.parseDouble(input.nextLine()));
            System.out.print("Impuesto: ");
            P2.setImpuesto(Double.parseDouble(input.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Error en la entrada de datos: por favor introduce un número válido.");
        }
        System.out.println("\nDatos del primer producto:");
        P1.muestraProducto();
        System.out.println("\nDatos del segundo producto:");
        P2.muestraProducto();
        System.out.println("Cual es el porcentaje de utilidad?");
        double utilidad = input.nextDouble();
        Producto.compararProductos(P1, P2, utilidad);
    }
}
