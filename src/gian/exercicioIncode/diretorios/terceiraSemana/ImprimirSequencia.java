package gian.exercicioIncode.diretorios.terceiraSemana;
import java.util.Scanner;

public class ImprimirSequencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um número: ");
        int numero = entrada.nextInt();
        for (int g = 1; g <= numero; g+=2){
            System.out.println(g);
        }



    }
}
