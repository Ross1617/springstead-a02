/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Ross Springstead
*/
/*
    import scanner
    ask the user for the order amount and save it as a double
    ask the user for the state they are in and save it as a string
    check to see if the string matches WI
    if it does calculate a tax by multiplying by .055
    round up the  value to 2 digits by using math.ceil
    calculate the subtotal by adding the two values
    print the results
 */


import java.util.Scanner;
public class Solution14 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
    private double roundUp(double number){
        number = number*100;
        number = Math.ceil(number);
        number = number /100;
        return number;
    }

    private double value;
    private String state;
    private double total;
    private double tax ;

    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        sol.value = Double.valueOf(sol.readInput("What is the order amount? "));
        sol.state = sol.readInput("What is the state? ");
        if (sol.state.equals("WI")){
            sol.tax = .055 * sol.value;

        }
        sol.value = sol.roundUp(sol.value);
        sol.total = sol.value + sol.tax;
        System.out.printf("The subtotal is $%.2f \nThe tax is $%.2f \nThe total is $%.2f ", sol.value, sol.tax, sol.total);


    }
}
