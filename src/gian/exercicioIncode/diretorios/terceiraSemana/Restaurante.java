package gian.exercicioIncode.diretorios.terceiraSemana;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner entradaJava = new Scanner(System.in);
        System.out.println("CARDÁPIO");
        System.out.println("1.Pizza \n2.Hambúguer \n3.Sushi");
        System.out.println("Qual a sua escolha? ");
        int escolha = entradaJava.nextInt();
        
        if (escolha ==  1){
            System.out.println("Aqui está a sua Pizza");
        } else if (escolha == 2) {
            System.out.println("Aqui está o seu Hambúguer");
        } else if (escolha == 3) {
            System.out.println("Aqui está o seu Sushi");
        }
        while (escolha < 1 || escolha > 3){
            System.out.println("OPÇÃO INVÁLIDA");
            System.out.println("CARDÁPIO:");
            System.out.println("1.Pizza \n2.Hambúguer \n3.Sushi");
            System.out.println("Qual a sua escolha? ");
            escolha = entradaJava.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Aqui está a sua Pizza");
                    break;
                case 2:
                    System.out.println("Aqui está o seu Hambúguer");
                    break;
                case 3:
                    System.out.println("Aqui está o seu Sushi");
                    break;
                default:
                    break;
            }
        }
    }
}