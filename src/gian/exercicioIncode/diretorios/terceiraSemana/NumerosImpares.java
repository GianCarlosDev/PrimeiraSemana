package gian.exercicioIncode.diretorios.terceiraSemana;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um número:");
        int numero = entrada.nextInt();
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}