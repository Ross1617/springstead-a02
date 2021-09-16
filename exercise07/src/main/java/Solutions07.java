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
    public static void main(String[] args) {
        final double squaredMeter = 0.09290304;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet?\n");
        int length = input.nextInt();
        System.out.print("What is the width of the room in feet?\n");
        int width = input.nextInt();
        System.out.printf("You entered the dimensions of %d feet and %d feet\n",length, width);
        int feet = width * length;
        double meter = feet * squaredMeter;
        System.out.printf("The area is \n%d squared feet\n",feet);
        System.out.printf("%.3f squared meters",meter);
    }
}
