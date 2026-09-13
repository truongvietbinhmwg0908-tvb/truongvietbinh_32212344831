package truongvietbinh_4831.Lec11_Encapsulation.Exercise8;

import java.util.Scanner;

public class CarProfile {

    private String make;
    private String model;
    private int year;

    public CarProfile() {

    }

    public CarProfile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void disPlayInfo() {
        System.out.println("make: " + getMake() + ", model: " + getModel() + ", year: " + getYear());
    }

    public void addProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter make:");
        setMake(sc.nextLine());
        System.out.println("Enter model:");
        setModel(sc.nextLine());
        System.out.println("Enter year:");
        setYear(sc.nextInt());
    }
}
