package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

    public static void main (String[] args) {
        Point p1 = new Point(7,11);
        Point p2 = new Point(7,13);
        double result = Point.distance(p1,p2);

        System.out.println("Расстояние между точками: " + result);
    }
}