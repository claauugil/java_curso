package Demos.prime;

import java.util.Scanner;

public class Primes {

     static int getNumByScanner(String msg){

        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf(msg);
        num = scanner.nextInt();
        scanner.close();
        return num;
    }

    static boolean  isPrime(int num)
    {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num %i == 0){
                return false;
            }
        }
        return (true);
    }

    public static void main(String[] args) {

        String msg = "Ingresa un número para ver si es primo o no\n";
        int num = getNumByScanner(msg);
        boolean isPrime = isPrime(num);
        if (isPrime == true){
            System.out.printf("El número %d es primo", num);
            return ;
        }
        System.out.printf("El número %d no es primo", num);
    }
}
