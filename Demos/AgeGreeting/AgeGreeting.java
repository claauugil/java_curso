public class AgeGreeting {
    public static void main(String[] args) {
        
        if (args.length == 0)
        {
            System.out.println("Ingresa tu edad en enteros");
            return;
        }
        int number = Integer.valueOf(args[0]);
        if (number <= 0)
            return;
        if (number < 18)
            System.out.printf("Eres menor\n");
        else if (number <= 33)
            System.out.printf("Eres joven\n");
        else if (number <= 65)
            System.out.printf("Eres adulto\n");
        else
            System.out.printf("Eres jubilado\n");
    }
}