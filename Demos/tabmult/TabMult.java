package Demos.tabmult;

import java.util.Scanner;

public class TabMult {
    
    static int getNum()
    {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingresa un número  del 1 al 20 para ver su tabla de multiplicar, si quieres verlas todas ingresa 11:\n");
        num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static void calcAndShowTable(int num)
    {
        if (num <= 0 || num > 11){
            System.err.println("El número debe ser positivo entre 1 y 10");
            return ;
        }
        if (num == 11)
        {
            for (int x = 1; x <= 10; x++) {
                  for (int i = 1; i <= 10; i++) {
                     int result = x * i;
                 System.out.printf ("%d x %d = %d\n", x, i, result);
                 }
                 System.out.println(); 
            }
            return;
        }
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.printf ("%d x %d = %d\n", num, i, result);
        }
    }
    public static void main(String[] args) {

        int num = getNum();
        calcAndShowTable(num);
    }
}
