package gian.exercicioIncode.diretorios.primeiraSemana;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitorDeEntrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitorDeEntrada.nextInt();
        if (numero %2 == 0){
            System.out.println( numero + " Esse número é par !");
        }else {
            System.out.println(numero + " Esse número é impar !");
        }
    }
}
