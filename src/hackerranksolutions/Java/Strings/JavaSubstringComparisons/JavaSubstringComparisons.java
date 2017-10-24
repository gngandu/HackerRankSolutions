package hackerranksolutions.Java.Strings.JavaSubstringComparisons;

/*	Author: George Ngandu
    Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
import java.util.*;

public class JavaSubstringComparisons {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int k = scan.nextInt();
        SortedSet<String> sets = new TreeSet<String>();
        for (int i = 0; i <= str.length() - k; i++) {
            sets.add(str.substring(i, i + k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());

    }
}
