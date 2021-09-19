/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Ross Springstead
 */
/*
    import scanner
    prompt the user to give a number for the month
    use switch statement to see what number the user provided and return the corresponding month
    use concatination to for a string with the correct month
    print the month out 
 */

import java.util.Scanner;
public class Solution21 {
    private static final Scanner in = new Scanner(System.in);
    private int readInt(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }
    private int month;
    private String statement;
    private String monthCalculator(int number){
        switch (number){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month";

        }
    }
    public static void main(String[] args) {
        Solution21 sol = new Solution21();
        sol.month = sol.readInt("Please enter the number of the month: ");
        sol.statement = "The name of the month is " + sol.monthCalculator(sol.month);
        System.out.println(sol.statement);

    }
}
