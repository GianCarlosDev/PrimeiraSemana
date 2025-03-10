package gian.exercicioIncode.diretorios.terceiraSemana;
import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número para uma cor do semáforo: " +
                "1. vermelho; " +
                "2.amarelo; " +
                "3.verde " +
                "4.sair");
        int cor = scanner.nextInt();
        if (cor == 1 || cor == 2 || cor == 3 || cor == 4) {
            switch (cor) {
                case 1: {
                    System.out.println("O SEMÁFORO ESTÁ VERMELHO");
                    break;
                }
                case 2: {
                    System.out.println("O SEMÁFORO ESTÁ AMARELO");
                    break;
                }
                case 3: {
                    System.out.println("O SEMÁFORO ESTÁ VERDE");
                    break;
                }
                case 4: {
                    System.out.println("SAINDO");
                    break;
                }
                default:
                    break;
            }
        }else {
            System.out.println("Opcão Inválida");
        }
    }
}