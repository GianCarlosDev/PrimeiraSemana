package gian.exercicioIncode.diretorios.primeiraSemana;
import java.util.Scanner;

public class Acesso {
    public static void main(String[] args) {
        Scanner entradaJava = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nomeDoUsuario = entradaJava.next();
        System.out.println("digite a senha: ");
        Integer senhaDoUsuario = entradaJava.nextInt();
        Integer senhaAcesso = 1234;
        String usuario = "GIAN" ;
        boolean acessoPermitido = (nomeDoUsuario.toUpperCase().equals(usuario) && senhaDoUsuario.equals(senhaAcesso));
        System.out.println(acessoPermitido);
        System.out.println("ACESSO LIBERADO");
    }
}
