/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Springstead
 */
/*
    import scanner
    defining the amount of square feet used in a gallon to 350 as a constant
    prompt the user for the length and width of the room and assign them to variables
    calculate the sqFeet by multiplying the width and length
    calculate the amount of paint needed by dividing the sqFeet by the constant
    to see if another gallon is needed do the module of sqFeet and gallon
    if their is a remainder the amount of gallons of paint needs to be increased by one
    print the amount of gallons and total squaredFeet

 */
import java.util.Scanner;
public class Solution09 {
    private static final Scanner in = new Scanner(System.in);
    private int readInt(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }
    private final int gallon = 350;
    private int length;
    private int width;

    public static void main(String[] args) {
        Solution09 sol = new Solution09();
        sol.length = sol.readInt("What is the length of the room in feet?");
        sol.width = sol.readInt("What is the width of the room in feet?");
        int sqFeet = sol.width * sol.length;
        int paint = sqFeet / sol.gallon;
        int remainderCatcher = sqFeet % sol.gallon;
        if (remainderCatcher > 0){
            paint ++;
        }
        System.out.printf("You will need to purchase %d gallons of paint to cover %d squared feet",paint, sqFeet);


    }
}
