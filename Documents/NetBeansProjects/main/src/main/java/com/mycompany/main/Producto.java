package com.mycompany.main;
public class Producto {
    private String descripcion;
    private String codigo;
    private String tipo;
    private double costo;
    private double impuesto;
    public Producto(String descripcion, String codigo, String tipo, double costo, double impuesto) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.tipo = tipo;
        this.costo = costo;
        this.impuesto = impuesto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public double getImpuesto() {
        return impuesto;
    }
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    public void muestraProducto() {
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Codigo: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: " + costo + "$");
        System.out.println("Impuesto: %" + impuesto);
    }
    public double calcularPrecio(double utilidad) {
        double costo1 = costo + (costo * utilidad / 100);
        double costoF = costo1 + (costo1 * impuesto / 100);
        return costoF;
    }
public static void compararProductos(Producto p1, Producto p2, double utilidad) {
     double precio1 = p1.calcularPrecio(utilidad);
     double precio2 = p2.calcularPrecio(utilidad);
     if (precio1 > precio2) {
         System.out.println(p1.getDescripcion()+" cuesta mas que "+p2.getDescripcion()+"\nCuesta: "+precio1);
     } else {
         System.out.println(p2.getDescripcion()+" cuesta mas que "+p1.getDescripcion()+"\nCuesta: "+precio2);
        }
    }    
}
