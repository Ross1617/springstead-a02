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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the principal: ");
        int principle = input.nextInt();
        System.out.printf("What is the rate of interest (in a percentage): ");
        double rate = input.nextDouble();
        System.out.printf("Enter the number of years: ");
        int years = input.nextInt();
        double calculatedRate = rate /100;
        double value = principle* (1 + calculatedRate * years);
        value = value*100;
        value  = Math.ceil(value);
        value = value /100;
        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.", years, rate, value);
    }
}
