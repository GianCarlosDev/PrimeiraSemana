package gian.exercicioIncode.diretorios.terceiraSemana;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite um número: "));
        String operador = JOptionPane.showInputDialog("Escolha uma operação: \n+ \n- \n* \n/");
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite outro número: "));


        switch (operador){
            case "+": {
                int adicao = numero1 + numero1;
                JOptionPane.showMessageDialog(null, adicao);
                break;
            } case "-":{
                int subtracao = numero1 - numero2;
                JOptionPane.showMessageDialog(null, subtracao);
                break;
            } case "*": {
                int multiplicacao = numero1 * numero2;
                JOptionPane.showMessageDialog(null, multiplicacao);
                break;
            } case "/":{
                if (numero2 != 0){
                int divisao = numero1 / numero2;
                JOptionPane.showMessageDialog(null, divisao);
                break;
                }else {
                    JOptionPane.showMessageDialog(null, "o divisor não pode ser zero");
                }
            } default:
                break;
        }
    }
}
