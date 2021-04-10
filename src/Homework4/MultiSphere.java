package Homework4;

public class MultiSphere {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(7.5f);
        Sphere sphere2 = new Sphere(56.2f);
        Sphere sphere3 = new Sphere(sphere2);
        sphere2.setDiameter(44.7f);

        System.out.println(sphere1);
        System.out.println(sphere2);
        System.out.println(sphere3);
    }
}
