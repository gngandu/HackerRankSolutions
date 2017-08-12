/*	Author: George Ngandu
    Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
 
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lenghtA = A.length();
        int lenghtB = B.length();
        System.out.println(lenghtA + lenghtB);
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1, B.length()));
        
        
    }
}
