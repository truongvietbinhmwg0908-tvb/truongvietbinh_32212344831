package truongvietbinh_4831.Lec10_Abstract.Exercise2;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        Employee employee = new FullTimeEmployee(name, salary);
        employee.disPlayInfo();
        System.out.println("Salary: " + employee.calculateSalary());

    }
}
