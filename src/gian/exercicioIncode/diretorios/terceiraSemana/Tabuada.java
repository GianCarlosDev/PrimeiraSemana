package gian.exercicioIncode.diretorios.terceiraSemana;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entradaJava = new Scanner(System.in);
        System.out.println("digite um número: ");
        int numero = entradaJava.nextInt();
        System.out.println("TABUADA DO NÚMERO " + numero);

        for (int g = 1; g <= 10; g++){
            System.out.println(numero + " x " + g + " = " + (numero * g));
        }
    }
}
