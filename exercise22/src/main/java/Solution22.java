/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
 *  Copyright 2021 Ross Springstead
 */
/*
    import scanner
    create a int[]
    ask the user to input 3 numbers and store them in the int[]
    take each value of the int[] and compare it with each other
    if a number is larger store it in the variable larger
    else if two numbers are the same break the program and return and error
    after all the numbers have been checked return and print the largest number  
 */

import java.util.Scanner;


public class Solution22 {
    private int[] listOfNumbers = new int[3];
    private static final Scanner in = new Scanner(System.in);
    private int readInt(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }
    private String  compareList(int[] list){
        int largest = list[0] ;
        for (int i = 1; i < list.length; i++){
            if( largest < list[i]){
                largest = list[i];
            }
            else if(largest == list[i]) {
                return "Numbers are the same";
            }
        }
        return "The largest number is " + largest;

    }


    public static void main(String[] args) {
        Solution22 sol = new Solution22();
        for (int i = 0; i< 3; i++){
            sol.listOfNumbers[i] = sol.readInt("Enter a number");
        }
        System.out.printf(sol.compareList(sol.listOfNumbers));



    }
}
