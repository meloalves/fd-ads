import javax.swing.*;

class Somar {
    private static void main(String[] args) {
        int[] VetSoma;
        int i;
        int soma = 0;
        VetSoma = new int [100];

        for (i = 0; i <= 99; i++) {
            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma = soma + VetSoma[i];
        }

        System.out.println("A soma dos 100 valores digitados é: " + soma);
        System.exit(0);
    }
}
