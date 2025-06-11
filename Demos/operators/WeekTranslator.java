package Demos.operators;

import java.util.Scanner;

public class WeekTranslator {
    
    static  String getDay()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un día de la semana para ver su traducción a inglés");
        String day = scanner.nextLine();
        scanner.close();
        return day;
        
    }
    public static void main(String[] args) {
     
        String day = getDay();

        switch (day.toLowerCase()) {
            case "lunes":
                System.out.println("Monday");
                break;
            case "martes":
                System.out.println("Tuesday");
                break;
            case "miercoles":
            case "miércoles":
                System.out.println("Wednesday");
                break;
            case "jueves":
                System.out.println("Thursday");
                break;
            case "viernes":
                System.out.println("Friday");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Día inválido");
                break;
        }
    }
}
