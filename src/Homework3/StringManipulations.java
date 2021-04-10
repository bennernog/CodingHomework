package Homework3;

import Utils.InputRequests;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

/*  Homework 3.1
    Write a program that prompts for and reads the user’s first and last name (separately).
    Then print a string composed of the first letter of the user’s first name, followed by
    the first five characters of the user’s last name, followed by a random number
    in the range 10 to 99. Assume the last name is at least five letters long.
 */
public class StringManipulations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Predicate<String> namePredicate = s -> s.matches("^[\\w|-]+$");
        String firstName = InputRequests.requestString(
                scanner,
                "Please input your first name: ",
                namePredicate
        ).toLowerCase();
        String lastName = InputRequests.requestString(
                scanner,
                "Please input your last name: ",
                namePredicate
        ).toLowerCase();

        int randomNumber = ThreadLocalRandom.current().nextInt(10, 100);

        System.out.printf(
                "%nYour username is %s%s%d%n",
                firstName.substring(0, 1),
                lastName.length() < 5 ? lastName : lastName.substring(0, 5),
                randomNumber
        );

        scanner.close();
    }
}
