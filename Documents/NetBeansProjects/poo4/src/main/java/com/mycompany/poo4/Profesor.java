
package com.mycompany.poo4;

/**
 *
 * @author holas
 */
public class Profesor {
    private String Nombre;
    private Materia Materia;
    private int NumNomina;
    private int SaldoHr;
    public Profesor(String Nombre, int NumNomina, int SaldoHr) {
        this.Nombre = Nombre;
        this.NumNomina = NumNomina;
        this.SaldoHr = SaldoHr;
    } public void agregarMateria(Materia Materia) {
        this.Materia = Materia;
    } public String getNombre() {
        return Nombre;
    } public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    } public int getNumNomina() {
        return NumNomina;
    } public void setNumNomina(int NumNomina) {
        this.NumNomina = NumNomina;
    } public int getSaldoHr() {
        return SaldoHr;
    } public void setSaldoHr(int SaldoHr) {
        this.SaldoHr = SaldoHr;
    } public void mostrarProfe(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Materia: " + Materia.getNombre());
        System.out.println("Numero de nomina: " + NumNomina);
        System.out.println("Saldo por hora: " + SaldoHr + "$");
        int T= (SaldoHr*Materia.getHoras());
        System.out.println("Imparte la materia "+Materia.getNombre()+" por "+Materia.getHoras()+" horas, dando un total de "+T+"$");
    }
}
