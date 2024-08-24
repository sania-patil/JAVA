import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    // Calendar calendar = Calendar.getInstance();

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
             Calendar calendar = Calendar.getInstance();
        
        // Set the calendar to the given date
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1); // Month is 0-based
        calendar.set(Calendar.YEAR, year);
        
        // Get the day of the week
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        // Convert day of week to string
        String dayOfWeekString = "";
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                dayOfWeekString = "SUNDAY";
                break;
            case Calendar.MONDAY:
                dayOfWeekString = "MONDAY";
                break;
            case Calendar.TUESDAY:
                dayOfWeekString = "TUESDAY";
                break;
            case Calendar.WEDNESDAY:
                dayOfWeekString = "WEDNESDAY";
                break;
            case Calendar.THURSDAY:
                dayOfWeekString = "THURSDAY";
                break;
            case Calendar.FRIDAY:
                dayOfWeekString = "FRIDAY";
                break;
            case Calendar.SATURDAY:
                dayOfWeekString = "SATURDAY";
                break;
        }
        
        return dayOfWeekString;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}