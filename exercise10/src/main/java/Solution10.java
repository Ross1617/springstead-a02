/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
 *  Copyright 2021 Ross Springstead
/*
    import scanner
    ask the user for price 1 and quantity 1 and save information
    ask the user for price 2 and quantity 2 and save information
    ask the user for price 3 and quantity 3 and save information
    calculate the sub total by multiplying each price by quantity and adding all three
    calculate tax by multiplying subtotal with the tax .055
    calculate the total by adding subtotal and tax
    print the subtotal, tax, and total to 2 decimals
 */

import java.lang.Math;
import java.util.Scanner;

public class Solution10 {
    private static final Scanner in = new Scanner(System.in);
    private int readInt(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }
    private double readDouble(String prompt) {
        System.out.println(prompt);
        return in.nextDouble();
    }
    private double twoDigitRounder(double number) {
        return (double) Math.round(number * 100) / 100;
    }

    private String stringBuilder(double subTotal, double total, double tax){
        return "Subtotal: $"+ subTotal + "\nTax: $" + total + "\nTotal: $"+ tax;

    }
    private double price1;
    private double price2;
    private double price3;
    private int quantity1;
    private int quantity2;
    private int quantity3;

    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        sol.price1 = sol.readDouble("Enter the price of item 1: ");
        sol.quantity1 = sol.readInt("Enter the quantity of item 1: ");
        sol.price2 = sol.readDouble("Enter the price of item 2: ");
        sol.quantity2 = sol.readInt("Enter the quantity of item 2: ");
        sol.price3 = sol.readDouble("Enter the price of item 3: ");
        sol.quantity3 = sol.readInt("Enter the quantity of item 3: ");

        double subTotal = (sol.price1 * sol.quantity1) + (sol.price2 * sol.quantity2) + (sol.price3 * sol.quantity3);
        double tax = subTotal * .055;
        double total = tax + subTotal;
        total = sol.twoDigitRounder(total);
        tax = sol.twoDigitRounder(tax);
        subTotal = sol.twoDigitRounder(subTotal);
        System.out.print(sol.stringBuilder(subTotal,tax, total));

        //System.out.printf("\nSubtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f",subTotal, tax, total);

    }
}
