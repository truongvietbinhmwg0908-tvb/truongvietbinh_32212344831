package truongvietbinh_4831.Lec03_Scanner;

import java.util.Scanner;

public class RectangularExercise {

    public static float calculateAreaRectangular(float length, float width) {
        float area = length * width;
        return area;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter length: ");
        Float length = scanner.nextFloat();

        System.out.println("enter width: ");
        Float width = scanner.nextFloat();
        
        Float area = calculateAreaRectangular(length,width);
        System.out.println("Dien tich: " + length * width);
    }

}
