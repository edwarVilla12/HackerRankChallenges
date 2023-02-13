package WordsNormalizer;

import java.math.BigInteger;
import java.util.Scanner;


public class BigIntegerChallenge {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BigInteger bg = sc.nextBigInteger();

        if(bg.isProbablePrime(1)){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
        sc.close();
    }
}
