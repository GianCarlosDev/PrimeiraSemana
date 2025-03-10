package gian.exercicioIncode.diretorios.primeiraSemana;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner entradaJava = new Scanner(System.in);
        System.out.println("Qual o tamanho do raio? ");
        double raio = entradaJava.nextDouble();
        double areaCirculo = (raio * raio) * Math.PI;
        System.out.printf("a área do circulo é: %.5f ", areaCirculo);

    }
}
