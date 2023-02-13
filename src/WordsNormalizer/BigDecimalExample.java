package WordsNormalizer;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class BigDecimalExample {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer arrayLength = sc.nextInt();
        String[] numbers = new String[arrayLength];

        for(int i = 0; i < arrayLength; i++){
            numbers[i] = sc.next();
        }

        Arrays.sort(numbers, 0, arrayLength, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal bd1 = new BigDecimal(o1);
                BigDecimal bd2 = new BigDecimal(o2);

                return bd2.compareTo(bd1);
            }
        });

        for(String s : numbers){
            System.out.println(s);
        }



    }

}
