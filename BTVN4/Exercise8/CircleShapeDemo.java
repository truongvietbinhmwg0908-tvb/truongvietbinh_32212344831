package truongvietbinh_4831.Lec08_ObjectAndClass.Exercise8;

public class CircleShapeDemo {

    public static void main(String[] args) {
        CircleShape circle = new CircleShape();

        circle.enterRadius();

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
