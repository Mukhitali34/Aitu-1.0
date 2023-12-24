//import models.Point;
//import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class MyApplication {
//     throws FileNotFoundException
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\mukhy\\IdeaProjects\\Aitu-1.0\\out\\test.txt");
//        File file =
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
//        int sz = sc.nextInt();
        while (sc.hasNext()) {
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