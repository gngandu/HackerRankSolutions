package hackerranksolutions.Java.Strings.JavaAnagrams;

/*	Author: George Ngandu
    Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
import java.util.*;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        char[] A = a.toLowerCase().toCharArray();
        Arrays.sort(A);
        char[] B = b.toLowerCase().toCharArray();
        Arrays.sort(B);
        return Arrays.equals(A, B);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
