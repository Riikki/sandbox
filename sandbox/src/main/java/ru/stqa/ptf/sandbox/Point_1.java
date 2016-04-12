package ru.stqa.ptf.sandbox;

public class Point_1 {
    public double x;
    public double y;

    public Point_1(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static double distance (Point_1 p1, Point_1 p2) {
        double cathetus1 = p1.x - p2.x;
        double cathetus2 = p1.y - p2.y;
        
        double distance = Math.sqrt(Math.pow((cathetus1), 2) + Math.pow((cathetus2), 2));
        return distance;
    }
}
