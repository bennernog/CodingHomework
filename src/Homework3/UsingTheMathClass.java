package Homework3;

import Utils.InputRequests;

import java.util.Scanner;

/*  Homework 3.2 – Using The Math Class
    Write a program that prints the sum of cubes.
    Prompt for and read two integer values and print the sum
    of each value raised to the third power
 */
public class UsingTheMathClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = InputRequests.requestInt(scanner, "Input first number: ");
        int number2 = InputRequests.requestInt(scanner, "Input second number: ");

        double cube1 = Math.pow(number1, 3);
        double cube2 = Math.pow(number2, 3);

        System.out.printf(
                "%n%d³ + %d³ = %.0f%n",
                number1,
                number2,
                cube1 + cube2
        );

        scanner.close();
    }
}
