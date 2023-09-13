import java.util.Scanner;

public class testeMedia {
    public static void main(String[] args) {
        double primeiraNota;
        double segundaNota;
        double media;

        int contador = 1;
        Scanner leitor = new Scanner(System.in);
        while (contador <= 3) {

            System.out.println("Escreva a primeira nota: ");
            primeiraNota = leitor.nextDouble();

            System.out.println("Escreva a segunda nota: ");
            segundaNota = leitor.nextDouble();

            media = (primeiraNota + segundaNota) / 2;

            if (media >= 7) {
                System.out.println("Parabéns, você foi aprovado! Sua nota foi " + media);

            } else if (media == 4 || media < 7) {
                System.out.println("Que pena, você está de recuperacão. Sua nota foi " + media);

            } else {
                System.out.println("Que pena, você foi reprovado. Sua nota foi " + media);

            }
            contador = contador + 1;

        }
        leitor.close();
    }
}
