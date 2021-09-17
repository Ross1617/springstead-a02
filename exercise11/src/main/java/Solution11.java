/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
 *  Copyright 2021 Ross Springstead
/*
    import scanner and math
    ask the user for the amount of euros the have and save value and cast it to int
    ask the user for the conversion rate and save it and cast it to double
    assign the dollar amount to rate * euros
    need to make sure the dollar conversion is rounded up to two decimal places
    multiply dollars by 100
    use the function ceil to round up
    divide dollars by 100 so it is correct number
    print the three values that are used
 */

import java.util.Scanner;
import java.lang.Math;
public class Solution11 {
    private static final Scanner in = new Scanner(System.in);
    private int euros;
    private double rate;
    private String readInput(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        sol.euros =  Integer.valueOf(sol.readInput("How many euros are you exchanging?"));
        sol.rate = Double.valueOf(sol.readInput("What is the exchange rate? "));

        double dollars = sol.rate * sol.euros;
        dollars = dollars*100;
        dollars = Math.ceil(dollars);
        dollars = dollars /100;
        System.out.printf("%d euros at %.4f at an exchange rate of is\n%.2f American Dollars ",sol.euros, sol.rate, dollars );

    }
}
