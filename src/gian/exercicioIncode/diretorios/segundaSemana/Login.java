package gian.exercicioIncode.diretorios.segundaSemana;
import  java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner entradaJava = new Scanner(System.in);
        int tentativasRestantes = 5;
        String senhaAceso = "2402";
        while (tentativasRestantes > 0) {
            System.out.println("digite a senha: ");
            String senha = entradaJava.next();
            tentativasRestantes--;
            if (senha.equals(senhaAceso)){
                System.out.println("ACESSO PERMITIDO");
                break;
            }else {
                System.out.println("SENHA INCORRETA, TENTE NOVAMENTE");
            }
            System.out.println("VOCÊ TEM " + tentativasRestantes + " TENTATIVAS RESTANTES !");
            if (tentativasRestantes == 0){
                System.out.println("ACESSO BLOQUEADO !");
            }
        }
    }
}
