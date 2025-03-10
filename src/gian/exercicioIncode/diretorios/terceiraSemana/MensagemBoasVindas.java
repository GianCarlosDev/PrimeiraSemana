package gian.exercicioIncode.diretorios.terceiraSemana;

import javax.swing.*;

public class MensagemBoasVindas {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Boas vindas " + nome);

    }
}
