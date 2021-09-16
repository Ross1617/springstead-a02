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
    public static void main(String[] args) {
        final int gallon = 350;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet?\n");
        int length = input.nextInt();
        System.out.print("What is the width of the room in feet?\n");
        int width = input.nextInt();
        int sqFeet = width * length;
        int paint = sqFeet / gallon;
        int remainderCatcher = sqFeet % gallon;
        if (remainderCatcher > 0){
            paint ++;
        }
        System.out.printf("You will need to purchase %d gallons of paint to cover %d squared feet",paint, sqFeet);


    }
}
