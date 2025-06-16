package Demos.reverse;


public class Reverse {

   /* public static void main(String[] args) {
        

        String str = "Hola buenas";
        int len = str.length() - 1;

        while (len >= 0)
        {
            System.out.print(str.charAt(len));
            len--;
        }
        System.out.println();
    }*/

    /*static String trimString(String value)
    {
        String res = "";

        for (int i = 1; i < value.length() - 1; i++) {
            res = value.charAt(i) + res;
        }
        return res;
    }*/

    public static String reverseString(String value)
    {
        String res = "";

        for (int i = 0; i < value.length(); i++) {
            res = value.charAt(i) + res;
        }
        return res;
    }
    public static void main(String[] args) {
        String test = "Prueba";
        String reverse = reverseString(test);
       // String trim = trimString(test);
        System.out.println("Original: " + test);
       // System.out.println("Original: " + trim);
        System.out.println("Original: " + reverse);
    }
}
