package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//  Welcome output
        System.out.println("Welcome to Bea's first calculator!\n");
//  Enter numbers
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

/*  I used printf so I could add a space between the number input and possible calculator,
    I also used \n so I could print the options on a new line each time */

        System.out.printf("%n Possible calculations: \n (A)dd \n (S)ubtract \n (M)ultiply \n (D)ivide %n");
        System.out.println("Please select your option: ");
        input.nextLine();
        String option = input.nextLine();

        System.out.println("Preparing to do Math✨✨✨");



    }
}
