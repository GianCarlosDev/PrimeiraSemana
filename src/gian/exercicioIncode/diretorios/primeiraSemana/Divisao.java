package gian.exercicioIncode.diretorios.primeiraSemana;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("digite outro numero: ");
        double numero2 = scanner.nextDouble();
        double divisao = numero1 / numero2;
        System.out.println("o resultado da divisão é: " + divisao);
    }
}
