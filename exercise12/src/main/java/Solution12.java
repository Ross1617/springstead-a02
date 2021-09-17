/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
 *  Copyright 2021 Ross Springstead
 */
/*
    import scanner and math
    ask the user for three inputs and assign them to variables - principle as int, rate of interest as a percentage as double, and years as int
    calculate the rate by dividing by 100
    calculating the value of the investment by using the formula principle*(1+ rate/100 * years)
    round value up to the nearest cent by multiplyin by 100, using ceil, then dividing by 100
    print the three values years rate and value
 */
import java.util.Scanner;
import java.lang.Math;
public class Solution12 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
    private int principle;
    private double rate;
    private  int years;


    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        sol.principle =  Integer.valueOf(sol.readInput("Enter the principal: "));
        sol.rate = Double.valueOf(sol.readInput("What is the rate of interest (in a percentage):"));
        sol.years = Integer.valueOf(sol.readInput("Enter the number of years: "));

        double calculatedRate = sol.rate /100;
        double value = sol.principle* (1 + calculatedRate * sol.years);
        value = value*100;
        value  = Math.ceil(value);
        value = value /100;
        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.", sol.years, sol.rate, value);
    }
}
