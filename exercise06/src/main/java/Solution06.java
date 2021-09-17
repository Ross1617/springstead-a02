/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 06
 *  Copyright 2021 Ross Springstead
 */
/*
    search the web for an import that will get the current year
    use the imported class to set an integer to the current year
    ask the user to give their age and assign it to a variable
    ask the user to give you the age the want to retire and assign it to a variable
    create a variable that takes the difference of retire - age
    print out the amount of years left they have til retire
    create a new variable that holds how many years they have + current year
    print the current year and the year they will retire
*/

import java.time.LocalDate;
import java.util.Scanner;

public class Solution06 {
    private static final Scanner in = new Scanner(System.in);
    private int readIntInput(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }
    private int age;
    private int retire;

    public static void main(String[] args) {
        Solution06 sol = new Solution06();
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();

        sol.age = sol.readIntInput("What is your current age? ");
        sol.retire = sol.readIntInput("What age do you wish to retire? ");
        System.out.print("What is your current age?\n");

        int yearsToRetire = sol.retire - sol.age;
        System.out.printf("You have " + yearsToRetire + " years left until you can retire\n");
        int retireYear = current_Year + yearsToRetire;
        System.out.printf("The current year is " + current_Year + " and you can retire in " + retireYear +"\n");


    }
}
