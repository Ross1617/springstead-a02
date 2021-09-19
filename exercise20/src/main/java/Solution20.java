/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
 *  Copyright 2021 Ross Springstead
 */
/*
    import scanner
    ask the user for what the order amount is and save it to variable
    ask the user for what state they are in
        if they are in wisconsin then ask them what county they are in
            if they are in one of the two counties that were specified adjust the tax
            and then save the tax to variable
        else if they are in illinois charge them a different tax rate and save it
    add up the tax and the order amount and save it
    round that number up to the nearest cent
    print the tax and total Order
 */

import java.util.Scanner;

public class Solution20 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
    private double round(double number){
        number = number*100;
        number = Math.ceil(number);
        number = number /100;
        return number;
        }
    private String state;
    private String county;
    private double total;
    private double orderAmount;
    private  double tax;
    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        sol.orderAmount = Double.valueOf(sol.readInput("What is the order amount?"));
        sol.state = sol.readInput("What state do you live in? ");
        if (sol.state.equals("Wisconsin")){
            sol.county = sol.readInput("What county do you live in?");
            if(sol.county.equals("Eau Claire")){
                sol.tax = sol.orderAmount * .0505;

            }
            else if (sol.county.equals("Dunn")){
                sol.tax = sol.orderAmount * .0504;
            }
            else{
                sol.tax = sol.orderAmount * .05;
            }

        }
        else if (sol.state.equals("Illinois")){
            sol.tax = sol.orderAmount * .08;
        }
        sol.total = sol.tax + sol.orderAmount;
        sol.total = sol.round(sol.total);
        System.out.printf("The tax is $%.2f\nThe total is $%.2f", sol.tax, sol.total);


    }
}
