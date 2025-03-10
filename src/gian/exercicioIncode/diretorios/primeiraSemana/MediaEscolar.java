package gian.exercicioIncode.diretorios.primeiraSemana;
import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua 1° nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("digite sua 2° nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("digite sua 3° nota:");
        double nota3 = scanner.nextDouble();
        double mediaFinal = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua media final é: " + mediaFinal);
        if (mediaFinal >= 7 && mediaFinal <= 10) {
            System.out.println("VOCÊ ESTÁ APROVADO ");
        } else if (mediaFinal >= 5 && mediaFinal < 7) {
            System.out.println("VOCÊ ESTÁ DE RECUPERAÇÃO FINAL");
        } else {
            System.out.println("VOCÊ ESTÁ REPROVADO");
        }
    }
}