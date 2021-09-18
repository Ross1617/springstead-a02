/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
 *  Copyright 2021 Ross Springstead

 */
/*
    imports scanner
    ask the user for there username and password and saves them to strings
    checks to see if the userPassword is equal to the master one
    if it is the same prints out custom greeting using the username
    else print out that the credentials are invalid
 */
import java.util.Scanner;
public class Solution15 {
    private static final Scanner in = new Scanner(System.in);
    private String masterPassword = "abc123$";
    private String username = "";
    private String userPassword = "";

    private String readInput(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }
    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        sol.username = sol.readInput("What is your username? " );
        sol.userPassword = sol.readInput("What is your password? ");
        if (sol.masterPassword.equals(sol.userPassword)){
            System.out.printf("Welcome back %s, how is your day going?", sol.username);
        }
        else{
            System.out.printf("Sorry your credentials do not match!");
        }


    }

}
