package gian.exercicioIncode.diretorios.segundaSemana;
import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite sua idade: ");
        int idade = entrada.nextInt();

        String maiorDeIdade = idade >= 18 ? "Você é maior de idade" : "Você é menor de idade";
        System.out.println(maiorDeIdade);



    }
}
