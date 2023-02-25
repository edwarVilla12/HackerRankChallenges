package WordsNormalizer;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexToMatchAvailableUsernames {

        static class UsernameValidator{

            static boolean validUsername(String username){

                Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{7,29}$");

                Matcher m = p.matcher(username);

                if(m.find()){
                    return true;
                }else{
                    return false;
                }
            }
        }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            boolean[] b = new boolean[n];

            for(int i = 0; i < n; i++){

                if (sc.hasNextLine()){
                    String username = sc.nextLine();

                    b[i] = UsernameValidator.validUsername(username);
                }
            }

            for(boolean bo : b){
                System.out.println( bo==true ? "Valid" : "Invalid");
            }
        }
    }
}
