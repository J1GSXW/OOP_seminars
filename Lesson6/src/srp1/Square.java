package srp1;

import java.util.ArrayList;
import java.util.List;

public class Square {

    public void draw(){
        for (int i = 0; i < side * 2; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < side; i++) {
            System.out.print("*");
            for (int j = 1; j < side; j++) {
                System.out.print("    ");
            }
            System.out.println(" *");
        }

        for (int i = 0; i < side * 2; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public int getArea(){
        return side * side;
    }

    public Square(Point point, int side) {
        this.side = side;
        Point point1 = new Point(point.getX() + side, point.getY());
        Point point2 = new Point(point.getX() + side, point.getY() + side);
        Point point3 = new Point(point.getX(), point.getY() + side);
        points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
    }

    public List<Point> getPoints() {
        return points;
    }

    public int getSide() {
        return side;
    }

    private List<Point> points;
    private int side;



}
