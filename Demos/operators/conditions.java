package Demos.operators;

public class conditions {
    public static void main(String[] args) {
        if (args.length == 0)
        {
            System.out.println("Añade tu edad a la linea de comandos");
        }
        else
        {
            int age = Integer.valueOf(args[0]);
            System.out.println("Tu edad es " + age);
        }
    }
}
