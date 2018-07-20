package hackerranksolutions.Java.Introduction.JavaCurrencyFormatter;

/*	Author: George Ngandu
        Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    /*
    Given a double-precision number, , denoting an amount of money, use 
    the NumberFormat class' getCurrencyInstance method to convert  into 
    the US, Indian, Chinese, and French currency formats. Then print the 
    formatted values as follows:
        US: formattedPayment
        India: formattedPayment
        China: formattedPayment
        France: formattedPayment
    where  is  formatted according to the appropriate Locale's currency.
    
    Note: India does not have a built-in Locale, so you must construct one where 
    the language is en (i.e., English).
    
    Input Format:
    --------------
    A single double-precision number denoting .
    
    Output Format:
    ----------------
    On the first line, print US: u where  is  formatted for US currency.
    On the second line, print India: i where  is  formatted for Indian currency.
    On the third line, print China: c where  is  formatted for Chinese currency.
    On the fourth line, print France: f, where  is  formatted for French currency.
    
    Sample Input:
    --------------
    12324.134
    
    Sample Output
    ----------------
    
    US: $12,324.13
    India: Rs.12,324.13
    China: ￥12,324.13
    France: 12 324,13 €
     */
    public static void main(String[] args) {
        double payment;
        try (Scanner scanner = new Scanner(System.in)) {
            payment = scanner.nextDouble();
            scanner.close();
        }

        //Initialising India Local
        Locale INDIA = new Locale("en", "IN");

        //passing the india local to number formatt to create indian formatt
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(INDIA);

        //New number formatts for locales for other countries
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        //Assingning the formatts to sting variables
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);

        //printing out the string variables
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
