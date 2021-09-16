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


import java.util.Scanner;
public class Solution10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double price1 = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = input.nextInt();
        System.out.print("Enter the price of item 2: ");
        double price2 = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        double price3 = input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = input.nextInt();
        double subTotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double tax = subTotal * .055;
        double total = tax + subTotal;
        System.out.printf("\nSubtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f",subTotal, tax, total);

    }
}
