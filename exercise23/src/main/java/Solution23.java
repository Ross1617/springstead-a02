/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 23
 *  Copyright 2021 Ross Springstead

 */
/*
    import scanner
    using the diagram that was provided ask the user a series of yes or no questions
    if the user says yes follow the diagram
    if the user says no follow the diagram
    after a result has been determined return the desired string
    print the string
 */

import java.util.Scanner;

public class Solution23 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
    private String problemFinder(){
        if (readInput("Is the car silent when you turn the key? ").equals("y")){
            if(readInput("Are the battery terminals connected?").equals("y")){
                return "Clean terminals and try again";
            }
            else{
                return "Replace cables and try again";
            }
        }
        else{
            if(readInput("Does the car make a slicking noise?").equals("y")) {
                return "Replace the battery";
            }
            else{
                if(readInput("Does the car crank up but fails to start?").equals("y")) {
                    return"Check the spark plug connections";
                }
                else{
                    if(readInput("Does the engine start then die?").equals("y")){
                        if(readInput("Does your car have fuel injection?").equals("y")){
                            return "Get it in for service";
                        }
                        else{
                            return "Check to ensure that the choke is opening and closing";
                        }
                    }
                    else{
                        return "that should not be possible";
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        System.out.printf("For this (y means yes) (n means no)\n");
        System.out.printf(sol.problemFinder());


    }
}
