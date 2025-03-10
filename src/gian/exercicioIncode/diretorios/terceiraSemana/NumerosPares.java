package gian.exercicioIncode.diretorios.terceiraSemana;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        System.out.println("digite um número: ");
        int numero = entrada.nextInt();
        for (int contador = 0; contador <= numero; contador +=2){
            System.out.println(contador);
        }

    }
}
