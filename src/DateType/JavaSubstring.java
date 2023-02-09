package DateType;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {
        /*
            Enter your code here. Read input from STDIN.
            Print output to STDOUT. Your class should be named Solution.
        */
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        int start = scanner.nextInt();
        int end  = scanner.nextInt();

        for(int i = start; i < end; i++){
            stringBuilder.append( s.substring(i , i + 1));
        }

        System.out.println(stringBuilder.toString());

    }

}
