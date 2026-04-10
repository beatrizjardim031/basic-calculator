package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//  Welcome output
        System.out.println("Welcome to Bea's first calculator!\n");
//  Enter numbers
        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();

        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();

/*  I used printf so I could add a space between the number input and possible calculator,
    I also used \n so I could print the options on a new line each time */

        System.out.printf("%n Possible calculations: \n (1) Add \n (2) Subtract \n (3) Multiply \n (4) Divide %n");
        System.out.println("Please select your option: ");
        input.nextLine(); //  "eat" the leftover CRLF
        int option = input.nextInt();



        if (option == 1){
            System.out.printf("Preparing to do Math ✨✨✨%n");
            System.out.printf("Here is your result: %.0f", (num1 + num2));

        } else if (option == 2) {
            System.out.printf("Preparing to do Math ✨✨✨%n");
            System.out.printf("Here is your result: %.0f", (num1 - num2));
        } else if (option == 3) {
            System.out.printf("Preparing to do Math ✨✨✨%n");
            System.out.printf("Here is your result: %.0f", (num1 * num2));
        } else if (option == 4){
            System.out.printf("Preparing to do Math ✨✨✨%n");
            System.out.printf("Here is your result: %.2f", (num1 / num2));
        } else {
            System.out.println("Invalid option. Please select 1-4.");
        }

    }
}
