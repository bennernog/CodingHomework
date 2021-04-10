package Homework3;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

/*  Homework 3.8: Calculating Volume and Surface of a Cylinder using Java Math class
    Write an app that generates a random integer radius (r) and height (h) for a cylinder in the
    range 1 to 10, inclusive, and then computes the volume and surface area of the cylinder.
    Surface area = 2πr² + 2πrh
    Volume = πr²h
    */
public class VolumeAndSurfaceOfCylinder {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        int radius = random.nextInt(1, 10);
        int height = random.nextInt(1, 10);
        double pi = Math.PI;

        double volume = ( 2D * pi * Math.pow(radius, 2)) + ( 2D * pi * radius * height );
        double surface = pi * Math.pow(radius, 2) * height;
        DecimalFormat decimalFormat = new DecimalFormat("0.####");

        System.out.printf(
                "%nA cylinder with a radius of %d units and a height of %d units " +
                        "has a surface area of %s units² and a volume of %s units³.%n",
                radius,
                height,
                decimalFormat.format(surface),
                decimalFormat.format(volume)
        );


    }
}
