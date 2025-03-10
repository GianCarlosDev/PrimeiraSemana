package gian.exercicioIncode.diretorios.primeiraSemana;
import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner leitoEntradas = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int nume1 = leitoEntradas.nextInt();
        System.out.println("digite outro numero: ");
        int nume2 = leitoEntradas.nextInt();

        System.out.println("ADIÇÃO:");
        int soma = nume1 + nume2;
        System.out.println(soma);
        System.out.println("SUBTRAÇÃO:");
        int subtrai = nume1 - nume2;
        System.out.println(subtrai);
        System.out.println("MULTIPLICAÇÃO:");
        int multiplica = nume1 * nume2;
        System.out.println(multiplica);

    }
}
