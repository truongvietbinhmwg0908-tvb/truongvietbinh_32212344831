package truongvietbinh_4831.Lec05_Loops;

import java.util.Random;
import java.util.Scanner;

public class BT10 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(20 - 1 + 1) + 1;
        int number;
        int count = 0;
        do {
            System.out.println("Enter a number: ");
            number = console.nextInt();
            count++;
            if (number < n) {
                System.out.println("Higher");
            } else if (number > n) {
                System.out.println("Lower");
            }
        } while (number != n);

        System.out.println("Correct!");
        System.out.println("Total attempts: " + count);
    }
}
