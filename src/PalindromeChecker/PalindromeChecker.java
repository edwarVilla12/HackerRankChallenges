package PalindromeChecker;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeChecker {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String word = scanner.next();
            int wordLenght = word.length();

            // First method to do a palindrome checker //
            if(isPalindrome(word)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

            // First method to do a palindrome checker //
            if(isPalindromeSecondVersion(word)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }


    // First method //
    public static boolean isPalindrome(String word){
        int wordLenght = word.length();
        String reversedWord = "";
        for( int i = (wordLenght - 1); i >= 0; --i){
            reversedWord += word.charAt(i);
        }
        if(word.toLowerCase().equals(reversedWord.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }

    // PalindromeChecker Second method                                               //
    // if the first middle part of the string is different to the other part, that   //
    // means the word is palindrome (if the first middle part of the string is equal //
    // to the second, it does not mean th word is palindrome)                        //
    public static boolean isPalindromeSecondVersion(String word){
        int wordLength = word.length();
        for( int  i = 0; i < wordLength / 2; i++){
            if(word.charAt(i) != word.charAt(wordLength - i - 1)){
                return false;
            }
        }
        return true;
    }

}
