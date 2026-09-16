package truongvietbinh_4831.Lec10_Abstract.Exercise2;

public abstract class Employee {

    private String name;

    public Employee() {

    }

    public Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void disPlayInfo() {
        System.out.println("Name:" + name);
    }

    public abstract double calculateSalary();

}
