/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Ross Springstead
 */
/*
    import scanner
    ask the user to enter their height and weight make sure they enter a number
    calculate BMI by using the formula provided
    print the BMI
    check to see if the BMI falls within ideal weight
    if not check to see if it is underweight
    else they are overweight
    print ideal, underweight, or overweight
 */



import java.util.Scanner;
public class Solution19 {
    private static final Scanner in = new Scanner(System.in);
    private double readInput(String prompt) {
        System.out.println(prompt);
        while (!in.hasNextDouble()){
            in.next();
            System.out.println("Please enter a number");
        }

        return in.nextDouble();
    }
    private double height;
    private double weight;
    private double BMI;
    private double calculatorBMI(double height, double weight){
        double holder = (weight / (height* height) * 703);
        return holder;
    }

    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        sol.height = sol.readInput("What is your height in inches?");
        sol.weight = sol.readInput("What is your weight in pounds?");
        sol.BMI = sol.calculatorBMI(sol.height, sol.weight);
        System.out.printf("Your BMI is %.1f\n", sol.BMI);
        if( (18.5 <= sol.BMI) && (sol.BMI<= 25) ){
            System.out.printf("You are within the ideal weight range.");
        }
        else if(18.5 > sol.BMI){
            System.out.printf("You are underweight. You should see your doctor.");
        }
        else{
            System.out.printf("You are overweight. You should see your doctor");
        }





    }
}
