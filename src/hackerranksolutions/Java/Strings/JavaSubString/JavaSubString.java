package hackerranksolutions.Java.Strings.JavaSubString;

/*	Author: George Ngandu
    Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
import java.util.*;

public class JavaSubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
