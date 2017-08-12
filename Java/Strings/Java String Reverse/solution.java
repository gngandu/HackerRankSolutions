/*	Author: George Ngandu
    Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
 
import java.util.*;
import java.text.*;

public class Solution {
    
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        String B = sb.toString();
        if (A.equals(B)){
            System.out.println("Yes");            
        } else{
            System.out.println("No");  
        }
}
