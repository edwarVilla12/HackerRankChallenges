import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws IOException {

       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());*/

        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i) );
        }
        sc.close();
    }
}