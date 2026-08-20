package truongvietbinh_4831.Lec03_Scanner;

import java.util.Scanner;

public class StudenInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fullname");
        String fullname = scanner.nextLine();

        System.out.println("Enter GPA");
        float gpa = scanner.nextFloat();

        System.out.println("fullname: " + fullname);
        System.out.println("GPA: " + gpa);

    }
}
