package WordsNormalizer;

import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class                  should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        Pattern p = Pattern.compile("[ ]", Pattern.CASE_INSENSITIVE);
        String[] words = sentence.trim().split("[\\s]+|[\\!\\,\\?\\.\\_\\'\\@\\s]+");

        String c = sentence.trim().toString();
        Matcher m = p.matcher(c);
        if(m.find()){

            int wordsLength = words.length;
            System.out.println(wordsLength);
            for (String word2 : words) {
                System.out.println(word2);
            }
        }else if(words[words.length - 1].equals("a") ){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
