package WordsNormalizer;

import java.math.BigInteger;
import java.util.Scanner;


public class BigIntegerChallenge {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger bg1 = sc.nextBigInteger();
        BigInteger bg2 = sc.nextBigInteger();



        BigInteger bg = sc.nextBigInteger();

        if(bg.isProbablePrime(1)){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
        sc.close();

        System.out.println(bg1.add(bg2));
        System.out.println(bg1.multiply(bg2));
    }
}
