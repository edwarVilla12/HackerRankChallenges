package AnagramChecker;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    /**
     * Read or initialize two strings str1 and str2.
     * Find the length of both the strings.
     * Compare the length of the strings.
     * If length is not equal, print strings are not an anagram.
     * Else, do the following:
     * Convert the string into a character array.
     * Sort both the arrays by using the sort() method.
     * After sorting, compare the strings by using the equals() method. Store the value in a Boolean variable (status) returned by the equals() method.
     * Pass the variable in the if statement. If it returns true, the given strings are anagram. Else, not an anagram.
     */

    static boolean isAnagram(String a, String b) {
       // String a = a.replaceAll("\\s", ""); //removes white spaces from string 1
       // String a = a.replaceAll("\\s", ""); //removes white spaces from string 2
        if(a.length() != b.length()){
            return false;
        }else{
            char[] ArrA = a.trim().toLowerCase().toCharArray();
            char[] ArrB = b.trim().toLowerCase().toCharArray();
            Arrays.sort(ArrA);
            Arrays.sort(ArrB);
            System.out.println(ArrA.equals(ArrB));
            System.out.println(Arrays.equals(ArrA , ArrB));
            return Arrays.equals(ArrA , ArrB);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}