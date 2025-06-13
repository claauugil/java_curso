package Demos.iteration;

public class ForLoop {
    
    static final int LIMIT = 10;
    static final String NAMES[] = {"María, Juana, Ana, Valentina"};

    static void showInfo(int i)
    {
        int round = i + 1;
        System.out.printf("loop on %d\n", round);
    }
    public static void iterateString(){

        String ex = "Hola buenos dias";

        for (int i = 0; i < ex.length(); i++) {
            System.out.println(ex.charAt(i));
        }
    }
   /*  public static void arrayForEach(){
        
        for (String item : NAMES) {
            System.out.println("Hola " + item);
        }
    }

    public static void arrayFor(){

        for (int i = 0; i < NAMES.length; i++) {
            System.out.println("Buenas " + NAMES[i]);
        }
    }*/
    public static void main(String[] args) {
        
        /*for (int i = 0; i < LIMIT; i++) {
            showInfo(i);
        }*/
        //arrayFor();
        //arrayForEach();
        iterateString();
    }
}
