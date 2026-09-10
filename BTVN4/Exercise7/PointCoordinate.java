package truongvietbinh_4831.Lec08_ObjectAndClass.Exercise7;

import java.util.Scanner;

public class PointCoordinate {

    private double x;
    private double y;

    public PointCoordinate() {
    }

    public PointCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void enterPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        this.x = scanner.nextDouble();
        System.out.print("Enter y: ");
        this.y = scanner.nextDouble();
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}
