package gian.exercicioIncode.diretorios.segundaSemana;
import java.util.Scanner;

public class MaiorQueZero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        do {
            System.out.println("ESSE CODIGO VAI SE REPETIR INFINITAMENTE");
            System.out.println("DIGITE UM NUMERO MAIOR QUE ZERO PARA INTERROMPER O CODIGO!");
            System.out.println("digite aqui: ");
            numero = entrada.nextInt();
        }while (numero < 0);
    }
}
