package DateType;

import java.util.Scanner;

public class StdinStdout {

    public static void main(String[] args) {
        /*
            Enter your code here. Read input from STDIN.
            Print output to STDOUT. Your class should be named Solution.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the a value: ");
        int a = sc.nextInt();
        System.out.println("Type the b value: ");
        int b = sc.nextInt();
        System.out.println("Type the c value: ");
        int c = sc.nextInt();

        System.out.println("a: " + a +".32d");
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

}
