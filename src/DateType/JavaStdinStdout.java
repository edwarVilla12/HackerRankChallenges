package DateType;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double d = scan.nextDouble();
        DecimalFormat df = new DecimalFormat("#.00");
        String di = df.format(d);

        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i = NumberFormat.getInstance(Locale.ENGLISH);
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + u.format(d));
        System.out.println("India: Rs." + i.format(Double.parseDouble(di)));
        System.out.println("China: " + c.format(d));
        System.out.println("France: " + f.format(d));

        scan.close();
    }

}
