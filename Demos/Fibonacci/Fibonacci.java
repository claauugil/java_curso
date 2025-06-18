package Demos.Fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {


    static int  getUserNum()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingresa un numero para ver su fibonacci\n");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    static ArrayList<Integer> getFibonacci(int maxNum, int num1, int num2)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);

        while (num1 + num2 < maxNum) {
      
            int next = num1 + num2;
            numbers.add(next);
            num1 = num2;
            num2 = next;
        }
        return numbers;
    }

    static void showFibonacci(ArrayList<Integer> serie)
    {
        System.out.printf("Secuencia: ");
        for (int i : serie) {
            System.out.println(i + " ");
        }
    }
     public static void main(String[] args) {
    
        int num = getUserNum();
        int num1 = 0;
        int num2 = 1;
        ArrayList<Integer> serie = getFibonacci(num, num1, num2);
        showFibonacci(serie);
    }   
}
