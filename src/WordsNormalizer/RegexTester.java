package WordsNormalizer;

import java.io.*;
import java.util.*;
    import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/*  -- Test Case --
         5
        ([a]+)(.+)
        [.]+
        [.]*
        [ ]*
        [AAAAAAAAAAAAAAAAAAAAAAAA]*
*/

public class RegexTester{

    public static void main(String[] args) {
        /*
           Yes, that's correct. The next method of the Scanner class reads the next token
           from the input and returns it as a String. When the input is "[ ]*",
           the next method will return "[ ]" as two separate tokens.
           To fix this issue, you can use the nextLine method instead of next, like this:
         */

        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        sc.nextLine();

        while(n-- > 0){
            try{
                Pattern.compile(sc.nextLine());
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}