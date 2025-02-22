
package com.mycompany.poo4;
/**
 *
 * @author holas
 */
public class Alumno {
    private String Nombre;
    private Curso Curso;
    private int Matricula;
    private int Edad;
    public Alumno(String Nombre, Curso Curso, int Matricula, int Edad) {
        this.Nombre = Nombre;
        this.Curso = Curso;
        this.Matricula = Matricula;
        this.Edad = Edad;
    } public String getNombre() {
        return Nombre;
    } public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    } public int getMatricula() {
        return Matricula;
    } public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    } public int getEdad() {
        return Edad;
    } public void setEdad(int Edad) {
        this.Edad = Edad;
    } public void mostrarAlumno() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Curso: " + Curso.getNombre());
        System.out.println("Matricula: " + Matricula);
        System.out.println("Edad: " + Edad + "$");
    }
}
