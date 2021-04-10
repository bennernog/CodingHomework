package Homework3;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

/*  Homework 3.7: Calculating Sine, Cosine, and Tan using Math and Random classes
    Write an app that generates a random integer in the range of 20 to 40 inclusive,
    and displays the sine, cosine, and tangent of that number */
public class CalculatingSinCosTan {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        int randomAngle = random.nextInt(20, 41);
        DecimalFormat decimal = new DecimalFormat("#.###");

        System.out.printf(
                "%nThe number is %d:%n\t- the sine is %s%n\t- the cosine is %s%n\t- the tangent is %S%n",
                randomAngle,
                decimal.format(Math.sin(randomAngle)),
                decimal.format(Math.cos(randomAngle)),
                decimal.format(Math.tan(randomAngle))
        );
    }
}
