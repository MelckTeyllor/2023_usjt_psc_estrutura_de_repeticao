import java.util.Scanner;

import javax.swing.JOptionPane;

public class testeSegundaRepetição {
    public static void main(String[] args) {
        int quantosAlunos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos"));

        int contador = 1;
        Scanner leitor = new Scanner(System.in);
        while (contador <= quantosAlunos) {

            double primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota: "));
            double segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota"));
            double media;

            media = (primeiraNota + segundaNota) / 2;

            if (media >= 7) {

                JOptionPane.showMessageDialog(null, "Parabens, você foi aprovado! Sua nota foi " + media);

            } else if (media == 4 || media <= 6) {

                JOptionPane.showMessageDialog(null, "Não desanime, você esta de recuperacao. Sua nota foi " + media);

            } else {

                JOptionPane.showMessageDialog(null, "Que pena, você foi repovado. Sua nota foi " + media);

            }

            contador = contador + 1;

        }
        leitor.close();
    }
}
