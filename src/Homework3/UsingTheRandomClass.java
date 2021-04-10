package Homework3;

import java.util.concurrent.ThreadLocalRandom;

/*  Homework 3.3 – Using The Random Class
    Write a program that creates and prints a random phone number of the form XXX-XXX-XXXX.
    Include the dashes in the output. Do not let the first three digits contain an 8 or 9
    (but don’t be more restrictive than that),
    and make sure that the second set of three digits is no greater than 742.
 */
public class UsingTheRandomClass {

    public static void main(String[] args) {

        ThreadLocalRandom random = ThreadLocalRandom.current();

        System.out.printf(
                "%d%d%d-%d-%d",
                random.nextInt(1,8),
                random.nextInt(1,8),
                random.nextInt(1,8),
                random.nextInt(100,742),
                random.nextInt(100,1000)
        );
    }
}
