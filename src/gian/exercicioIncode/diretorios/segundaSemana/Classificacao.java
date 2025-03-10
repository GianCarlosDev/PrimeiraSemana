package gian.exercicioIncode.diretorios.segundaSemana;
import java.util.Scanner;

public class Classificacao {
    public static void main(String[] args) {
        Scanner entradajava = new Scanner(System.in);
        System.out.println("digite sua nota: ");
        double nota = entradajava.nextDouble();
        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7 ) {
            System.out.println("Recuperação");
            
        }else
            System.out.println("Reprovado");
    }
}
