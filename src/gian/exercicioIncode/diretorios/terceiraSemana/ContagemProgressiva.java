package gian.exercicioIncode.diretorios.terceiraSemana;
import java.util.Scanner;

public class ContagemProgressiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero = entrada.nextInt();

        for (int contador = 0; contador <= numero; contador++){
            System.out.println(contador);
        }
    }
}
