package gian.exercicioIncode.diretorios.segundaSemana;
import java.util.Scanner;

public class Condicoes {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero: ");
        double numero = entrada.nextDouble();
        if (numero > 0){
            System.out.println("POSITIVO");
        } else if (numero < 0) {
            System.out.println("NEGATIVO");
        }else {
            System.out.println("É ZERO");
        }



    }

}
