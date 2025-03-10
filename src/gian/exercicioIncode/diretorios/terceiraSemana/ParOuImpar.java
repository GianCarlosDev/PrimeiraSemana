package gian.exercicioIncode.diretorios.terceiraSemana;

import javax.swing.*;

public class ParOuImpar {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("digite um numero: ");
        int numeroDigitado = Integer.parseInt(numero);
        if (numeroDigitado %2 == 0){
            JOptionPane.showMessageDialog(null,"O número digitado é par");
        }else {
            JOptionPane.showMessageDialog(null,"O número digitado é ímpar");
        }

    }
}
