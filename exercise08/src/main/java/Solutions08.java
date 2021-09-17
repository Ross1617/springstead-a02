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
    private static final Scanner in = new Scanner(System.in);
    private int readIntInput(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }

    private int people;
    private int slices;
    private int pizzas;

    public static void main(String[] args) {
        Solutions08 sol = new Solutions08();
        sol.people = sol.readIntInput("How many people?");
        sol.slices = sol.readIntInput("How many pizzas do you have?");
        sol.pizzas = sol.readIntInput("How many slices per pizza?");

        int totalSlices = sol.slices * sol.pizzas;
        int slicesPerPerson = totalSlices / sol.people;
        int remainderSlices = totalSlices % sol.people;
        System.out.printf("%d people with %d pizzas (%d total slices)\n",sol.people, sol.pizzas, totalSlices);
        System.out.printf("Each person will get %d slices of pizza\n",slicesPerPerson);
        System.out.printf("And there will be %d leftover slices", remainderSlices);




    }
}
