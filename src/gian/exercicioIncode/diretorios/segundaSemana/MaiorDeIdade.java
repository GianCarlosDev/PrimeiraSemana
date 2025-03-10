package gian.exercicioIncode.diretorios.segundaSemana;
import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Você é estudante: Sim ou Não ");
        String  estudante = scanner.next();
        if (idade >= 18 && estudante.equalsIgnoreCase( "Sim")){
            System.out.println("Você tem direito a desconto");
        }else {
            System.out.println("Você não tem direito desconto");
        }


    }
}
