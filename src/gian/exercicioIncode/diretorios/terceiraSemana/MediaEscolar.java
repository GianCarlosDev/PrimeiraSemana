package gian.exercicioIncode.diretorios.terceiraSemana;

import javax.swing.*;

public class MediaEscolar {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("digite sua 1° nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("digite sua 2° nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("digite sua 3° nota"));


        double mediaFinal = (nota1 + nota2 + nota3) / 3;
        JOptionPane.showMessageDialog(null, "A sua media final é: " + String.format("%.2f", mediaFinal));
        if (mediaFinal >= 7) {
            JOptionPane.showMessageDialog(null, " VOCÊ ESTÁ APROVADO");
        } else if (mediaFinal >= 5 && mediaFinal < 7) {
            JOptionPane.showMessageDialog(null, " VOCÊ ESTÁ RECUPERAÇÃO");
        } else {
           JOptionPane.showMessageDialog(null, " VOCÊ ESTÁ REPROVADO");
       }
    }
}
