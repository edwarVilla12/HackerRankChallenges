/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * The Pattern.compile method takes two arguments: the first argument is the regular expression, and the second argument is a flag that modifies the behavior of the pattern. In this case, the Pattern.CASE_INSENSITIVE flag makes the pattern case-insensitive.
The Matcher.find method searches for the next occurrence of the pattern in the input string and returns true if it finds a match, or false if there are no more matches.
The Matcher.group method returns the entire matched string, and Matcher.group(1) returns the first captured group (the first occurrence of the word).
The Scanner class is used to read input from the standard input. The nextLine method is used to read each sentence.
 */
public class RegexStringRepeatedWords {
    
    public static void main(String[] args) {
             String regex = "\\b(\\w+)(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        String[] s = new String[numSentences];
        
        for(int i =0; i < numSentences; i++ ) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
                // Prints the modified sentence.
            }
            
            s[i] = input;
        }
        
        in.close();
        
        for(String f : s){
        // Prints the modified sentence.
            System.out.println(f);
        }
    }
}


    

