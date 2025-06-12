import java.util.Random;
import java.util.Scanner;

public class RandomMain {

    static int getNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero aleatorio");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }
    public static void main(String[] args) {

        int numToGuess = getNumber();
        Random randomMaker = new Random();
        int random2 = randomMaker.nextInt(2) + 1;
        if (random2 == numToGuess)
        {
            System.out.printf("Adivinaste! el número era el: %s", numToGuess);
            return;
        }
        System.out.printf("Incorrecto, el número era: %s", random2);
    }
}
