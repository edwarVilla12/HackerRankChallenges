import java.util.Scanner;

public class DataTypeLengthVer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long x = sc.nextLong();
            boolean flag = false;
            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                System.out.println(x + " can be fitted in:");
                System.out.println("* byte");
                flag = true;
            }
            if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                System.out.println(x + " can be fitted in:");
                System.out.println("* short");
                flag = true;
            }
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                System.out.println(x + " can be fitted in:");
                System.out.println("* int");
                flag = true;
            }
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                System.out.println(x + " can be fitted in:");
                System.out.println("* long");
                flag = true;
            }
            if (!flag) {
                System.out.println(x + " can't be fitted anywhere.");
            }
        }
    }
}

