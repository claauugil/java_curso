public class Functions {
   
    static int add(int num1, int num2){
        int result = num1 + num2;
        return (result);
    }

    static int substraction(int num1, int num2)
    {
        int result = num1 - num2;
        return (result);
    }
    public static void main(String[] args) {
    System.out.println("El resultado de la suma es: " + add(2, 6));
    System.out.println("El resultado de la resta es: " + substraction(10, 5));
   }
}