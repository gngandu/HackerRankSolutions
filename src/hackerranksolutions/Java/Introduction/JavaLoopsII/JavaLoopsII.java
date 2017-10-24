package hackerranksolutions.Java.Introduction.JavaLoopsII;

/*	Author: George Ngandu
    Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
import java.util.*;

public class JavaLoopsII {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int x = a;
            int b = in.nextInt();
            int n = in.nextInt();
            for (int k = 0; k < n; k++) {
                x += (int) (Math.pow(2, k) * b);
                System.out.print(x + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
