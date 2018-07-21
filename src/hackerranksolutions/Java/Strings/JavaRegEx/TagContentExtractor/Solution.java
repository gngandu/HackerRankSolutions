/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranksolutions.Java.Strings.JavaRegEx.TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Author: George Ngandu | Github: github.com/gngandu | HackerRank:
 * hackerrank.com/gngandu |
 * Upwork:https://www.upwork.com/freelancers/~01c2626289798328f7
 */
public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
