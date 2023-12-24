//package models;
//import java.util.Scanner

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    Point(double xx, double yy) {
         x = xx;
         y = yy;
    }

    // distance(Point dest) - distance from current point to the dest point
    public double distanceTo(double xx, double yy) {
        return Math.sqrt((xx - x) * (xx - x) + (yy - y) * (yy - y));
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    // toString
}