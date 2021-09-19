/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
 *  Copyright 2021 Ross Springstead
 */
/*
    import scanner
    ask the user for input for gender, ounces, weight, and hours but check if they have entered an integer
    if they did not enter an integer ask them to enter one again - repeat until they do
    when the do assign the input
    if the user is a male call the BAC function with the correct parameters to determine the BAC
    else use the function with the correct parameters for female
    check to see if the BAC is .8 or greater
    print the corresponding result

 */

import java.util.Scanner;
public class Solution17 {
    private int gender;
    private int ounces;
    private int weight;
    private int hours;
    private double bac;
    private final double bacMan = .73;
    private final double bacWoman = .66;
    private static final Scanner in = new Scanner(System.in);
    private int readInput(String prompt) {
        System.out.println(prompt);
        while (!in.hasNextInt()){
            in.next();
            System.out.println("Please enter an integer");
        }

        return in.nextInt();
    }
    private double calculateBAC(double gender, int ounces, int weight, int hours){
        return((ounces * 5.14/ weight* gender)- (.015 * hours));
    }

    public static void main(String[] args) {
        Solution17 sol = new Solution17();
        sol.gender= sol.readInput("What is your gender (enter a 1 for male and a 2 for female");
        sol.ounces = sol.readInput("How many ounces of alcohol did you have?");
        sol.weight = sol.readInput("What is your weight, in pounds?");
        sol.hours = sol.readInput("How many hours has it been since your last drink?");
        if(sol.gender == 1){
            sol.bac = sol.calculateBAC(sol.bacMan, sol.ounces, sol.weight, sol.hours);
        }
        else{
            sol.bac = sol.calculateBAC(sol.bacWoman, sol.ounces, sol.weight, sol.hours);
        }
        System.out.printf("Your BAC is %.6f\n",sol.bac);
        if (sol.bac >= .08){
            System.out.printf("It is not legal for you to drive.");
        }
        else{
            System.out.printf("It is legal for you to drive.");
        }

    }
}
