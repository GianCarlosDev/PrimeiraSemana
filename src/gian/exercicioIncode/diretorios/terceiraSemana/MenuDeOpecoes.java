package gian.exercicioIncode.diretorios.terceiraSemana;

import java.util.Scanner;

public class MenuDeOpecoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma ação: \n1.Correr \n2.Atirar \n3.Mirar \n4.Sair");
        int opcao = entrada.nextInt();
        if (opcao == 1) {
            System.out.println("Correndo");
        } else if (opcao == 2) {
            System.out.println("Atirando");
        } else if (opcao == 3) {
            System.out.println("Mirando");
        } else {
            System.out.println("Saindo");
        }
        while (opcao  != 4) {
            System.out.println("Escolha uma ação: \n1.Correr \n2.Atirar \n3.Mirar \n4.Sair");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("Correndo");
                    break;
                } case 2:{
                    System.out.println("Atirando");
                    break;
                } case 3:{
                    System.out.println("Mirando");
                    break;
                } case 4:{
                    System.out.println("Saindo");
                    break;
                } default:
                    break;
            }
        }
    }
}