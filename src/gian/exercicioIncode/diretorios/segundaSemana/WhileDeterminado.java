package gian.exercicioIncode.diretorios.segundaSemana;
import java.util.Scanner;

public class WhileDeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int numero = entrada.nextInt();
        int contador = 1;
        while (contador <= numero){
            System.out.println(contador);
            contador++;
        }
    }
}
