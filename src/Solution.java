import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        String s = Integer.toString(num);

        if (s != null && -100 <= num && num <= 100) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

    }
}
