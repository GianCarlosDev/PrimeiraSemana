package gian.exercicioIncode.diretorios.primeiraSemana;
import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner entradaJava = new Scanner(System.in);
        System.out.println("digte sua idade: ");
        int idade = entradaJava.nextInt();
        if (idade >= 18) {
            System.out.println("ACESSO PERMITIDO, IDADE SUFICIENTE");
        }else {
            System.out.println("ACESSO NEGADO, IDADE INSUFICIENTE");
        }
    }
}
