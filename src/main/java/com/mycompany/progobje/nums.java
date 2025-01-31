package com.mycompany.progobje;
import java.util.Arrays;
public class nums {
    public static void main(String[] args) {
        System.out.println("Numeros pares del 2 al 100");
        int[] pares = new int[50];
        for(int i = 2, j = 0; i <= 100; i+=2, j++){
            pares[j] = i;
        }
        System.out.println(Arrays.toString(pares));
    }
}
