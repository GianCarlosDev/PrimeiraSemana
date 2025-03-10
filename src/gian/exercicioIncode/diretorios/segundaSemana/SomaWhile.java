package gian.exercicioIncode.diretorios.segundaSemana;
import java.util.Scanner;

public class SomaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        System.out.println("digite um numero: ");
        int numero = scanner.nextInt();
        while (contador <= numero){
            int resultado = contador + contador ;
            System.out.println(contador + " + " + contador +  " = " + resultado);
            contador++;
        }
    }
}
