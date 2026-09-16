package truongvietbinh_4831.Lec10_Abstract.Exercise2;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee() {

    }

    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
