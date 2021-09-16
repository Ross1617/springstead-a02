/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
 *  Copyright 2021 Ross Springstead
/*
    import scanner and math
    ask the user for the amount of euros the have and save value
    ask the user for the conversion rate and save it
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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("How many euros are you exchanging? ");
        int euros = input.nextInt();
        System.out.printf("What is the exchange rate? ");
        double rate = input.nextDouble();
        double dollars = rate * euros;
        dollars = dollars*100;
        dollars = Math.ceil(dollars);
        dollars = dollars /100;
        System.out.printf("%d euros at %.4f at an exchange rate of is\n%.2f American Dollars ",euros, rate, dollars );

    }
}
