package org.example;

public class Main
{
        public static boolean isPalindrome (String word)
        {
            // Removeing spaces
            word = word.replaceAll("\\s", "").toLowerCase();

            // Comparing the word with reversed version
            String reversedWord = new StringBuilder(word).reverse().toString();

            // Returning true if the word is a palindrome, false otherwise
            return word.equals(reversedWord);
        }

        public static void main (String[]args)
        {
            // Example word to check if it is a palindrome
            String word = "Was it a car or a cat I saw";

            // Checking if the word is a palindrome and printing the result
            if (isPalindrome(word))
            {
                System.out.println(word + " is a palindrome");
            }
            else
            {
                System.out.println(word + " is not a palindrome");
            }
        }
}