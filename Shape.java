//package models;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private List <Point> li = new ArrayList<Point>();
    private int size = 0;

    // addPoint(Point) - adds to the container
    public void addPoint(Point x) {
        li.add(x);
        size++;
    }
    // calculatePerimeter()
    public double calculatePerimeter() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += li.get(i).distanceTo(li.get((i + 1) % size).getX(), li.get((i + 1) % size).getY());
        }
        return sum;
    }

    // getAverageSide()
    public double getAverageSide() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += li.get(i).distanceTo(li.get((i + 1) % size).getX(), li.get((i + 1) % size).getY());
        }
        return sum / size;
    }
    // getLongestSide()
    public double getLongestSide() {
        double max = 0;
        for (int i = 0; i < size; i++) {
            if (max < li.get(i).distanceTo(li.get((i + 1) % size).getX(), li.get((i + 1) % size).getY())) {
                max = li.get(i).distanceTo(li.get((i + 1) % size).getX(), li.get((i + 1) % size).getY());
            }
        }
        return max;
    }
}