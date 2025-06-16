package Demos.palindromos;

import java.util.Scanner;

import Demos.reverse.Reverse;

public class Palindrome {
    

    
    static String getPhrase()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingresa una frase para ver si e sun palindromo:\n");
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }

    static String removeSpace(String str)
    {
        int i = 0;
        String  newStr = "";

        while (i < str.length())
        {
            if (str.charAt(i) == ' ')
                i++;
            newStr += str.charAt(i);
            i++;
        }
        return newStr;
    }

    static boolean isPalindrome(String first, String last)
    {
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != last.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
        String str = getPhrase();
        String lower = str.toLowerCase();
        String noSpace = removeSpace(lower);
        String reversed = Reverse.reverseString(noSpace);
        boolean isPalindrome = isPalindrome(noSpace, reversed);
        
        System.out.printf("la frase es un palindromo: %b", isPalindrome);
    }
}
 