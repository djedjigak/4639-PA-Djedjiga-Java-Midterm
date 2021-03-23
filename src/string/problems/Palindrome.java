package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */

        Scanner string = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome");
        String inputString = getInputString();

        int length  = inputString.length();
        int i, Mom, Dad, Madam;

        Mom  = 0;
          Madam= length - 1;
        Dad = (Mom + Madam)/2;

        for (i = Mom; i <= Dad; i++) {
            if (inputString.charAt(Mom) == inputString.charAt(Madam)) {
                Mom++;
                Madam--;
            }
            else
                break;
        }
        if (i == Dad + 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }

    private static String getInputString() {
        String getInputString = getInputString();
        return getInputString();
    }
}
    

