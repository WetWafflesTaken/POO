package com.mycompany.progobje;
import java.util.Scanner;
public class ProgObje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String num = input.nextLine();
        if ("elio".equalsIgnoreCase(num)){
            System.out.println("Hola dev principal");
        } else {
            System.out.println("Hola "+num+"!");
        }
    }
}
