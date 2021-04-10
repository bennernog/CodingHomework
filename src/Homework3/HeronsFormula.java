package Homework3;

import Utils.InputRequests;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.Predicate;

import static Utils.InputRequests.*;

/*  Homework 3.6 – Heron’s Formula (Area of triangle) Using The Math Class and java string format
    Write an app that reads the lengths of the sides of a triangle from the user. Compute the area
    of the triangle using Heron’s formula in which ‘s’ represents half of the perimeter of the triangle,
    and ‘a’ and ‘b’ and ‘c’ are the lengths of the three sides. Print area to three decimal places.
    A = \sqrt{s(s-a)(s-b)(s-c)} where s is the semi-perimeter of the triangle*/
public class HeronsFormula {
    public static void main(String[] args) {

        //Getting Input from user
        Scanner scanner = new Scanner(System.in);
        Predicate<Double> hasToBePositive = i -> i > 0;
        String errorMessage = "Number has to positive and bigger than zero!";

        double sideA = requestDouble(scanner, "Input first side of triangle: ", hasToBePositive, errorMessage);
        double sideB = requestDouble(scanner, "Input second side of triangle: ", hasToBePositive, errorMessage);
        double sideC = requestDouble(scanner, "Input third side of triangle: ", hasToBePositive, errorMessage);

        //Calculating Area
        double s = ( sideA + sideB + sideC ) / 2;

        double area = Math.sqrt( s * (s - sideA) * (s - sideB) * (s - sideC) );

        //Displaying solution
        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        System.out.printf("Your triangle has an area of %s%n", decimalFormat.format(area));
    }
}
