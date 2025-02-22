
package com.mycompany.poo4;
import java.util.Scanner;
public class Poo4 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Materia M1 = new Materia("", "", 0, 0);
        Materia M2 = new Materia("", "", 0, 0);
        Materia M3 = new Materia("", "", 0, 0);
        Curso C1 = new Curso("", M1, M2, M3);
        System.out.print("Bienvenido al sistema escolar!\nEmpecemos configurando un curso y sus materias\nCual es el nombre del curso?  \n"); // Curso
        C1.setNombre(input.nextLine());
        System.out.print("Datos de primera materia-------\n"); // MATERIA 1
        System.out.print("Nombre: ");
        M1.setNombre(input.nextLine());
        System.out.print("Clave: ");
        M1.setClave(input.nextLine());
        System.out.print("Creditos: ");
        M1.setCreditos(input.nextInt());
        input.nextLine();
        System.out.print("Horas: ");
        M1.setHoras(input.nextInt());
        input.nextLine();
        System.out.print("Datos de segunda materia-------\n"); // MATERIA 2
        System.out.print("Nombre: ");
        M2.setNombre(input.nextLine());
        System.out.print("Clave: ");
        M2.setClave(input.nextLine());
        System.out.print("Creditos: ");
        M2.setCreditos(input.nextInt());
        input.nextLine();
        System.out.print("Horas: ");
        M2.setHoras(input.nextInt());
        input.nextLine();
        System.out.print("Datos de tercera materia-------\n"); // MATERIA 3
        System.out.print("Nombre: ");
        M3.setNombre(input.nextLine());
        System.out.print("Clave: ");
        M3.setClave(input.nextLine());
        System.out.print("Creditos: ");
        M3.setCreditos(input.nextInt());
        input.nextLine();
        System.out.print("Horas: ");
        M3.setHoras(input.nextInt());
        input.nextLine();
        System.out.print("Su curso "+C1.getNombre()+" salio asi:\n");
        C1.mostrarCurso();
        
        Profesor P1 = new Profesor("", 0, 0); //Profe
        Alumno A1 = new Alumno("", C1, 0, 0); //Alu
        System.out.print("Datos de profesor-------\n"); // Profesor
        System.out.print("Nombre: ");
        P1.setNombre(input.nextLine());
        System.out.print("Numero de Nomina: ");
        P1.setNumNomina(input.nextInt());
        input.nextLine();
        System.out.print("Saldo por Hora: ");
        P1.setSaldoHr(input.nextInt());
        input.nextLine();
        System.out.print("El profesor "+P1.getNombre()+" va a ensenar una clase?(y/n)");
        String con = input.nextLine();
        if ("y".equals(con)){
            System.out.print("Cual de las siguientes materias va a ensenar?\n(M1)"+M1.getNombre()+" | (M2)"+M2.getNombre()+" | (M3)"+M3.getNombre()+" |\n");
            String mat = input.nextLine();
            if(null != mat) switch (mat) {
                case "M1" -> P1.agregarMateria(M1);
                case "M2" -> P1.agregarMateria(M2);
                case "M3" -> P1.agregarMateria(M3);
                default -> {
                }
            }
        }
        System.out.print("Datos de Alumno-------\n"); //Alumno
        System.out.print("Nombre: ");
        A1.setNombre(input.nextLine());
        System.out.print("Matricula: ");
        A1.setMatricula(input.nextInt());
        input.nextLine();
        System.out.print("Edad: ");
        A1.setEdad(input.nextInt());
        input.nextLine();
        
        System.out.print("----- M A T E R I A S ------------------------------\n");
        M1.mostrarInfo();
        M2.mostrarInfo();
        M3.mostrarInfo();
        System.out.print("----- C U R S O S ----------------------------------\n");
        C1.mostrarCurso();
        System.out.print("----- P R O F E S O R E S --------------------------\n");
        P1.mostrarProfe();
        System.out.print("----- A L U M N O S --------------------------------\n");
        A1.mostrarAlumno();
    }
}
