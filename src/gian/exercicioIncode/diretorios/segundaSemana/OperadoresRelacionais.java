package gian.exercicioIncode.diretorios.segundaSemana;
import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int nume1 = entrada.nextInt();
        System.out.println("digite outro numero: ");
        int nume2 = entrada.nextInt();

        if (nume1 > nume2){
            System.out.println(nume1 + " é o maior que " + nume2);
        } else if (nume2 > nume1) {
            System.out.println(nume2 + " é maior que " + nume1 );

        }else {
            System.out.println("Os numeros são iguais: " + nume1);
        }
    }
}
