import javax.swing.*;

public class SomarSec {
    public static void main(String args[]) {
        int MatSoma[],a, b, soma = 0;
        MatSoma = new int[10][12];

        for (a = 0; a <= 9; a++) {
            for (b = 0; b <= 11; b++) {
                MatSoma[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro."));
                soma = soma + MatSoma[a][b];
            }
        }

        System.out.printIn("A soma dos 120 valores digitados é: " + soma);
        System.exit(0);
    }
}