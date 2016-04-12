package ru.stqa.ptf.sandbox;

public class MyFirstProgram {
    public static void main(String[] args){
        Point p1 = new Point(1,5);
        Point p2 = new Point(4,1);
        System.out.println("Pасстояние между двумя точками" + " P1 и P2 = "+ distance(p1, p2)) ;

    }

    public static double distance(Point p1,Point p2){
        double cathetus1 = p1.x- p2.x;
        double cathetus2 = p1.y- p2.y;
        return Math.sqrt(Math.pow((cathetus1), 2) + Math.pow((cathetus2), 2));
     }






//    public static void main (String[] args) {
//        Point_1 p1 = new Point_1(7,11);
//        Point_1 p2 = new Point_1(7,13);
//        double result = Point_1.distance(p1,p2);
//
//        System.out.println("Расстояние между точками: " + result);
//    }


}