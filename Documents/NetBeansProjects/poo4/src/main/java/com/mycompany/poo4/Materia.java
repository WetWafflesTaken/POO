
package com.mycompany.poo4;

public class Materia {
    private String Nombre;
    private String Clave;
    private int Creditos;
    private int Horas;
    public Materia(String Nombre, String Clave, int Creditos, int Horas) {
        this.Nombre = Nombre;
        this.Clave = Clave;
        this.Creditos = Creditos;
        this.Horas = Horas;
    } public String getNombre() {
        return Nombre;
    } public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    } public String getClave() {
        return Clave;
    } public void setClave(String Clave) {
        this.Clave = Clave;
    } public int getCreditos() {
        return Creditos;
    } public void setCreditos(int Creditos) {
        this.Creditos = Creditos;
    } public int getHoras() {
        return Horas;
    } public void setHoras(int Horas) {
        this.Horas = Horas;
    } 
    public void mostrarInfo() {
        System.out.println("Materia: "+Nombre+" - Clave: "+Clave+" - Creditos: "+Creditos+" - Horas: "+Horas);
    }
}
