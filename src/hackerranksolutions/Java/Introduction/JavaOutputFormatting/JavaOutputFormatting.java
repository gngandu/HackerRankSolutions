package hackerranksolutions.Java.Introduction.JavaOutputFormatting;

/*	Author: George Ngandu
    Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.format("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}
