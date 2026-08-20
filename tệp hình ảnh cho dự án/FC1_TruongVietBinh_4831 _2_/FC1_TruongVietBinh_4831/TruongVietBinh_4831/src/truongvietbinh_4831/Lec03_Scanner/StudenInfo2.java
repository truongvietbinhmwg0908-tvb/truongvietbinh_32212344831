package truongvietbinh_4831.Lec03_Scanner;

import java.util.Scanner;

public class StudenInfo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fullname");
        String fullname = scanner.nextLine();

        System.out.println("Enter gpa");
        Float gpa = scanner.nextFloat();

        scanner.nextLine();
        System.out.println("enter major");
        String major = scanner.nextLine();

        System.out.println("entet hometown");
        String hometown = scanner.nextLine();

        System.out.println("fullname: " + fullname + "\ngpa: " + gpa + "\nmajor: " + major + "\nhometown: " + hometown);
    }
}
