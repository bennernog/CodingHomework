package Homework3;

import Utils.InputRequests;

import java.text.DecimalFormat;
import java.util.Scanner;

/*  Homework 3.5 – Volume and Surface of Sphere using Math Class and java string format
    Write an app that reads the radius of a sphere and prints its volume and surface area.
    Print the output to four decimal places. */
public class VolumeAndSurfaceOfSphere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float radius = InputRequests.requestFloat(scanner, "Please input the radius of your sphere");
        radius = Math.abs(radius);

        double volume = (4/3f) * Math.PI * Math.pow(radius, 3);
        double surface = 4 * Math.PI * Math.pow(radius, 2);
        DecimalFormat decimalFormat = new DecimalFormat("0.####");

        System.out.printf(
                "%nA sphere with a radius of %s units has a surface area of %s units² and a volume of %s units³.%n",
                decimalFormat.format(radius),
                decimalFormat.format(surface),
                decimalFormat.format(volume)
        );
    }
}
