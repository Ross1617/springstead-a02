/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 08
 *  Copyright 2021 Ross Springstead
 */
/*
    imported scanner
    ask the user for how many people and assign it to variable
    ask the user for how many pizzas and assign it to variable
    ask the user for how many slices and assign it to variable
    calculate the amount of total slices and save the value to integer by multiplying pizzas by slices
    calculate the slicesPerPerson by dividing the total slices by people and store value
    calculate the remainder by using module of total slices / people
    print the people, pizza, totalSlices, slicesPerPerson and remainder
 */

import java.util.Scanner;
public class Solutions08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people?\n");
        int people = input.nextInt();
        System.out.print("How many pizzas do you have?\n");
        int pizza = input.nextInt();
        System.out.print("How many slices per pizza?\n");
        int slices = input.nextInt();
        int totalSlices = slices * pizza;
        int slicesPerPerson = totalSlices / people;
        int remainderSlices = totalSlices % people;
        System.out.printf("%d people with %d pizzas (%d total slices)\n",people, pizza, totalSlices);
        System.out.printf("Each person will get %d slices of pizza\n",slicesPerPerson);
        System.out.printf("And there will be %d leftover slices", remainderSlices);




    }
}
