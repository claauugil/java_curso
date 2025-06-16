package Demos.palindromos;

import Demos.reverse.Reverse;

public class Palindrome {
    
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
    
        String str = "Anita lava la tina";
        String lower = str.toLowerCase();
        String noSpace = removeSpace(lower);
        String reversed = Reverse.reverseString(noSpace);
        boolean isPalindrome = isPalindrome(noSpace, reversed);
        
        System.out.printf("la frase es un palindromo: %b", isPalindrome);
    }
}
 