/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
 *  Copyright 2021 Ross Springstead
 */

/*
    import scanner
    ask the user for there age
    use a ternary operator to see if that age is 16 or older
    if older assign the output to not include the word not
    else make the return output include not
    print the statement
 */
import java.util.Scanner;

public class Solution16 {
    private static final Scanner in = new Scanner(System.in);
    private int readLine(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }

    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        var statement= (sol.readLine("What is your age? ") >= 16) ? "You are old enough to legally drive" : "You are not old enough to legally drive";
        System.out.println(statement);


    }
}
