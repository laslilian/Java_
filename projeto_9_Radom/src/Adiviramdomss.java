import java.util.Scanner;
import java.util.Random;

public class Adiviramdomss {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int palpite, num = 0;
        num = rand.nextInt(10) + 1;
        System.out.println("Digite seu palpite: ");
        palpite = entrada.nextInt();
        if (palpite == num) {
            System.out.println("Você acertou!!! o número era " + num);
        }
        else {
            if (palpite < num) {
                System.out.println("seu palpite está abaixo!!! o número era " + num);

            } else {
                System.out.println("Seu palpite está acima. o numero era" + num);
            }
        }
        entrada.close();
    } // fim do método main

} // fim da classe advrandom
