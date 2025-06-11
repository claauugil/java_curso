package Demos.operators;

public class Week {
    
 public static void main(String[] args) {
    
   int day = 5;
    /*if (day == 1)
        System.out.println("Lunes");
    else if (day == 2)
        System.out.println(("Martes"));
    else if (day == 3)
        System.out.println(("Miercoles"));
     else if (day == 4)
        System.out.println(("Jueves"));
    else if (day == 5)
        System.out.println(("Viernes"));
    else if (day == 6)
        System.out.println(("Sabado"));
    else if (day == 7)
        System.out.println(("Domingo"));*/

    switch (day) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miercoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
        case 7:
             System.out.println("Weekend");
            break;
        default:
            System.out.println("Número inválido");
            break;
    }
 }
}
