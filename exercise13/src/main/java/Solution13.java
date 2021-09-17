/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
 *  Copyright 2021 Ross Springstead
 */
/*
    import scanner and math
    ask the user for four inputs and assign them to variables - principle as int, rate of interest as a percentage as double, years as int, and number of times as int
    calculate the rate by dividing by 100
    calculating the value of the investment by using the formula principle*(1+ rate/(100 * number)^(number* years))
    round value up to the nearest cent by multiplyin by 100, using ceil, then dividing by 100
    print the four values number, years, rate and value
 */
import java.util.Scanner;
import java.lang.Math;
public class Solution13 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
    private int principle;
    private double rate;
    private  int years;
    private  int number;


    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        sol.principle =  Integer.valueOf(sol.readInput("Enter the principal: "));
        sol.rate = Double.valueOf(sol.readInput("What is the rate of interest (in a percentage):"));
        sol.years = Integer.valueOf(sol.readInput("Enter the number of years: "));
        sol.number = Integer.valueOf(sol.readInput("Enter the number of times the interest is compounded per year: "));
        double calculatedRate = sol.rate /100;
        double value = sol.principle* Math.pow((1 + (calculatedRate/sol.number)), (sol.number* sol.years));
        value = value*100;
        value  = Math.ceil(value);
        value = value /100;
        System.out.printf("%d invested at %.2f%% for %d years compounded %d times per year is $%.2f.", sol.principle, sol.rate,sol.years, sol.number, value);

    }
}
