public class EvenOdss {
    public static void main(String[] args) {
        if (args.length == 0)
        {
            System.out.println("Ingresa un numero entero en la linea de comandos");
            return ;
        }
        int number = Integer.valueOf(args[0]);
        // (condition ? valor: valor)
        String result = (number % 2) == 0 ? "par" : "impar";
        System.out.printf("El número %s es %s", number, result);
    }
}
