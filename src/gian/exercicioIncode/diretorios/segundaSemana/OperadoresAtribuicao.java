package gian.exercicioIncode.diretorios.segundaSemana;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int saldo = 500;
        saldo += 300;
        System.out.println(saldo);

        double preco = 150.00;
        Double desconto = preco - (preco * 0.10);

        System.out.println(desconto);
    }
}
