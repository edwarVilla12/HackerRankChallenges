package SubstringComparison;

import java.util.Scanner;

public class JavaSubstringComparison {
        /*
            Enter your code here. Read input from STDIN.
            Print output to STDOUT. Your class should be named Solution.
        */
        public static String getSmallestAndLargest(String s, int k) {
            String currentString = s.substring(0,k);
            System.out.println(currentString);
            String smallest = currentString;
            String largest = currentString;

            for(int i = k; i < s.length(); i++){
                currentString = currentString.substring(1,k) + s.charAt(i);

                System.out.println(currentString);

                if(largest.compareTo(currentString) < 0){
                    largest = currentString;
                }else if(smallest.compareTo(currentString) > 0){
                    smallest = currentString;
                }
            }
            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }

}
