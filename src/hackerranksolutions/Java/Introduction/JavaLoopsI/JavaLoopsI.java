package hackerranksolutions.Java.Introduction.JavaLoopsI;

/*	Author: George Ngandu
    Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
import java.util.*;

public class JavaLoopsI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i < 11; i++) {
            int a = (N * i);
            System.out.println(N + " x " + i + " = " + a);
        }
    }
}
