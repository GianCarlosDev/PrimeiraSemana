package gian.exercicioIncode.diretorios.primeiraSemana;
import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner entradaJava = new Scanner(System.in);

        System.out.println("digite um numero: ");
        double numero = entradaJava.nextDouble();
        if (numero > 0){
            System.out.println("POSITIVO");
        } else if (numero < 0) {
            System.out.println("NEGATIVO");
        }else {
            System.out.println("É ZERO");
        }
    }
}
