package truongvietbinh_4831.BTVN;

import java.util.Scanner;

public class BT3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem tong ket: ");

        double n = scanner.nextDouble();

        if (n >= 5.0) {
            System.out.println("dat");
        } else {
            System.out.println("khong dat");
        }
    }
}
