/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 07
 *  Copyright 2021 Ross Springstead
 */
/*
    need to input scanner
    make the value of converting between squared feet and squared meters a constant
    ask the user for the length of room and store the variable
    ask the user for the width of room and store the variable
    print the width and length
    find the squared feet by multiplying width and height
    find the squared meters by multiplying squared feet and constant
    print both of these numbers
 */

import java.util.Scanner;
public class Solutions07 {
    private static final Scanner in = new Scanner(System.in);
    private int readDimension(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }
    private int length;
    private int width;
    private final double squaredMeter = 0.09290304;

    public static void main(String[] args) {

        Solutions07 sol = new Solutions07();
        sol.length = sol.readDimension("What is the length of the room in feet?");
        sol.width = sol.readDimension("What is the width of the room in feet?");

        System.out.printf("You entered the dimensions of %d feet and %d feet\n",sol.length, sol.width);
        int feet = sol.width * sol.length;
        double meter = feet * sol.squaredMeter;
        System.out.printf("The area is \n%d squared feet\n",feet);
        System.out.printf("%.3f squared meters",meter);
    }
}
