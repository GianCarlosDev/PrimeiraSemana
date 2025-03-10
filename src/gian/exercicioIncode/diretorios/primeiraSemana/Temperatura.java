package gian.exercicioIncode.diretorios.primeiraSemana;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner leitorEntrada = new Scanner(System.in);
        System.out.println("qual a temperatura em F° deseja converter:  ");
        int grausF = leitorEntrada.nextInt();
        final double x = 32;
        final double y = 5/9.0 ;
        double grausC = (grausF - x ) * y;
        System.out.println(grausF + " em Fahrenheit é " + grausC + " em Celsius");
    }
}
