import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double[] VetSoma = new double[50];
        double media, soma = 0;

        for (int i = 0; i < 50; i++) {
            System.out.println("Digite um número: ");
            VetSoma[i] = scan.nextDouble();
            soma += VetSoma[i];
        }

        media = soma/50;
        System.out.println("A media das 50 notas digitadas é: " + media);
        scan.close();
    }
}
