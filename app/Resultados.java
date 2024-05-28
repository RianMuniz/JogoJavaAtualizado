package app;

import java.util.Scanner;


public class Resultados {

    public static void resultado(int numero, int numero2, String nome1, String nome2){
        
             if (numero == 1 && numero2 == 1) {
        System.out.println("EMPATE");
    } else if (numero == 1 && numero2 == 2) {
        System.out.println(nome2 + " ganhou " + nome1 + ", " + nome1 + " pegue a arma e atire!");

    } else if (numero == 1 && numero2 == 3) {
        System.out.println(nome1 + " ganhou " + nome2 + ", " + nome2 + " pegue a arma e atire!");
    } else if (numero == 2 && numero2 == 1) {
        System.out.println(nome1 + " ganhou " + nome2 + ", " + nome2 + " pegue a arma e atire!");
    } else if (numero == 2 && numero2 == 2) {
        System.out.println("EMPATE");
    } else if (numero == 2 && numero2 == 3) {
        System.out.println(nome2 + " ganhou " + nome1 + ", " + nome1 + " pegue a arma e atire!");
    } else if (numero == 3 && numero2 == 1) {
        System.out.println(nome2 + " ganhou " + nome1 + ", " + nome1 + " pegue a arma e atire!");
    } else if (numero == 3 && numero2 == 2) {
        System.out.println(nome1 + " ganhou " + nome2 + ", " + nome2 + " pegue a arma e atire!");
    } else if (numero == 3 && numero2 == 3) {
        System.out.println("EMPATE");
    }

    }
}