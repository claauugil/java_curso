import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {

        String name;
        double age;

        System.out.println("¿Cuál es tu nombre?");

        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("¿Cuál es tu edad en números?");
        age = scanner.nextDouble();

        System.out.println("Hola " + name);
        System.out.println("Tienes " + age + " años");
        scanner.close();
    }
}
