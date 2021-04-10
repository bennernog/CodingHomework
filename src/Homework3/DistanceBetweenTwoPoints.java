package Homework3;

import java.util.concurrent.ThreadLocalRandom;

/*  Homework 3.4 – Distance Between Two Points using Math Class and java string format
    Write an application that reads the (x,y) coordinates for two points. Compute the distance
    between the two points using a formula */
public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        int x1 = random.nextInt(1000);
        int y1 = random.nextInt(1000);
        int x2 = random.nextInt(1000);
        int y2 = random.nextInt(1000);

        System.out.printf("Point 1 is at (%d, %d) \t\tPoint 2 is at (%d, %d)%n", x1, y1, x2, y2);

        int diffX = x2 - x1;
        int diffY = y2 - y1;

        double difference = (diffX * diffX) + (diffY * diffY);

        System.out.printf("The distance between these two points is %.2f", Math.sqrt(difference));

    }
}
