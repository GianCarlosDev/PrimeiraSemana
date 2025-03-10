package gian.exercicioIncode.diretorios.terceiraSemana;

import javax.swing.*;

public class Temperatura {
    public static void main(String[] args) {
       String temperatura =  JOptionPane.showInputDialog("Digite uma temperatura em graus Fahrenheit: ");
       double numeroDigitado = Double.parseDouble(temperatura);
        final double x = 32;
        final double y = 5/9.0 ;
        double grausC = (numeroDigitado - x ) * y;
        JOptionPane.showMessageDialog(null, numeroDigitado + " em Fahrenheit é " + grausC + " Em graus Celsius" );



    }
}
