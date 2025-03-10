package gian.exercicioIncode.diretorios.segundaSemana;

import java.util.Scanner;

public class LoginDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha = "";
        do {
            System.out.println("digite a senha correta");
            senha = entrada.next();
        }while (!senha.equalsIgnoreCase("1234"));
    }
}
