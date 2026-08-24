package truongvietbinh_4831.Lec05_Loops;

import java.util.Random;
import java.util.Scanner;

public class BT12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        int wrong = 0;

        while (wrong < 3) {

            int soHang = random.nextInt(4) + 2;
            int sum = 0;
            for (int i = 0; i <= soHang; i++) {
                int number = random.nextInt(10) + 1;
                sum += number;
                System.out.print(number);
                if (i < soHang) {
                    System.out.print(" + ");
                }
            }
            System.out.print(" = ");
            int answer = scanner.nextInt();
            if (answer == sum) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + sum);
                wrong++;
            }
            System.out.println();
        }
        System.out.println("Game over!");
        System.out.println("Your score: " + score);

    }
}
