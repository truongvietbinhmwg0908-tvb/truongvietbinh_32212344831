package truongvietbinh_4831.Lec05_Loops;

import java.util.Scanner;

public class BT7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        double sum = 0;
        double avg = 0;
        int count = 0;
        do {
            System.out.println("enter a number(0 to quit");
            number = scanner.nextDouble();
            if (number != 0) {
                sum = sum + number;
                count++;
            }
        } while (number != 0);
        if (count == 0) {
            System.out.println("no data");
        } else {
            System.out.println("sum " + sum);
            System.out.println("count " + count);
            System.out.println("average " + (sum / count));

        }

    }
}
