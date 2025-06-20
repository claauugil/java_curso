package Demos.factorial;

public class Factorial {

    static int calculateFactorial(int num){
        if (num < 0)
        {
            num *= -1;
        }
        int result = 1;
        for (int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calculateFactorial(20));
    }
}
