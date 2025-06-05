import java.util.Scanner;

public class AnimalScanning {
    public static void main(String[] args) {
        String   name;
        double   weight;
        long     population;
        byte     maxAge;

        System.out.println("Ingresa un animal");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("Ingresa el peso del " + name);
        weight = scanner.nextDouble();

        System.out.println("Ingresa la población del " + name);
        population = scanner.nextLong();

        System.out.println("Ingresa la esperanza de vida del " + name);
        maxAge = scanner.nextByte();  

        System.out.println(
            """
            El animal elegido fue el: %s
            El peso asignado fue: %.2f kg
            La población asignada fue: %d
            La esperanza de vida aproximada es de: %d                   
            """.formatted(name, weight, population, maxAge));
            scanner.close();
    }
}
