package hackerranksolutions.Java.Introduction.JavaDateandTime;

/*	Author: George Ngandu
    Github: github.com/gngandu
	HackerRank: hackerrank.com/gngandu
 */
import java.util.*;
import java.time.*;

public class JavaDateandTime {

    /*
    Instructions:
    --------------
    
    The Calendar class is an abstract class that provides methods for converting 
    between a specific instant in time and a set of calendar fields such 
    as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar 
    fields, such as getting the date of the next week.
    You are given a date. To simplify your task, we have provided a portion of the code 
    in the editor. You just need to write the method, which returns the day on that date.
    For example, if you are given the date , the method should return  as the day on that date.
    
    Input Format:
    -------------
    A single line of input containing the space separated month, day and year, 
    respectively, in   format.
    
    Output Format:
    --------------
    Output the correct day in capital letters.
    
    Sample Input:
    -------------
    08 05 2015
    
    Sample Output:
    --------------
    
    WEDNESDAY
    
     */
    public static void main(String[] args) {
        String month;
        String day;
        String year;
        try (Scanner sc = new Scanner(System.in)) {
            month = sc.next();
            day = sc.next();
            year = sc.next();
            sc.close();
        }
        String date = year + "-" + month + "-" + day;
        LocalDate dt = LocalDate.parse(date);
        System.out.println(dt.getDayOfWeek());
    }
}
