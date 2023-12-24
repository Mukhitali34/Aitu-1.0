//import models.Point;
//import models.Shape;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class MyApplication {
    // throws FileNotFoundException
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\admin\\IdeaProjects\\AssignmentOne\\src\\source.txt");
//        File file =
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        int sz = sc.nextInt();
        while (sz-- > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongestSide());
        System.out.println(shape.getAverageSide());
    }
}