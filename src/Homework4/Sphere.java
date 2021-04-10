package Homework4;

import java.text.DecimalFormat;

/*
    4.1 – Creating Sphere Class using Java OOP principles, Classes, and Objects (and Methods and Math Class)

    Design and implement a class called Sphere that contains instance data that represents the sphere’s diameter.
    Define the Sphere constructor to accept and initialize the diameter, and include getter and setter methods
    for the diameter.
    Include methods that calculate and return the volume and surface area of the sphere. Create a driver class
    called MultiSphere, whose main method instantiates and updates several Sphere objects.
*/
public class Sphere {

    private float diameter;

    public Sphere() {
        this(1f);
    }

    public Sphere(float diameter) {
        this.setDiameter(diameter);
    }

    public Sphere(Sphere sphere) {
        this.setDiameter(sphere.diameter);
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = Math.abs(diameter);
    }

    public double getSurface() {
        return 4D * Math.PI * Math.pow(diameter/2, 2);
    }

    public double getVolume() {
        return (4/3D) * Math.PI * Math.pow(diameter/2, 3);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format(
                "Sphere with a diameter of %s%nSurface area: %s\t\tVolume: %s%n",
                decimalFormat.format(this.getDiameter()),
                decimalFormat.format(this.getSurface()),
                decimalFormat.format(this.getVolume())
        );
    }
}
