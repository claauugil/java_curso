import java.util.Scanner;

public class Calculator {

    static int mult(int num1, int num2)
    {
        int result = num1 * num2;
        return result;
    }

    static int division(int num1, int num2)
    {
        int result = num1 / num2;
        return result;
    }

    static int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    static int subtraction(int num1, int num2)
    {
        int result = num1 - num2;
        return result;
    }
    static void calculator(int num1, int num2)
    {
        int sum;
        int subs;
        int mult;
        int div;

        sum = add(num1, num2);
        subs= subtraction(num1, num2);
        mult = mult(num1, num2);
        div = division(num1, num2);
        System.out.println("""
                La suma de los numeros es : %d
                La resta de los números es: %d
                La multiplicación de los numeros es %d
                La división de los numeros es: %d
                """.formatted(sum, subs, mult, div));
    }
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num1 = scanner.nextInt();
         System.out.println("Ingrese otro número");
        num2 = scanner.nextInt();
        calculator(num1, num2);
        scanner.close();
    }
}
