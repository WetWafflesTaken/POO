
package com.mycompany.poo4;

public class Curso {
    private String Nombre;
    private Materia M1;
    private Materia M2;
    private Materia M3;
    public Curso(String Nombre, Materia M1, Materia M2, Materia M3) {
        this.Nombre = Nombre;
        this.M1 = M1;
        this.M2 = M2;
        this.M3 = M3;
    } public String getNombre() {
        return Nombre;
    } public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    } public void mostrarCurso() {
        System.out.println("Materias del curso "+Nombre);
        M1.mostrarInfo();
        M2.mostrarInfo();
        M3.mostrarInfo();
        int T= (M1.getCreditos()+M2.getCreditos()+M3.getCreditos());
        System.out.println("El total de creditos para este curso es "+T+" creditos");
    }
}
