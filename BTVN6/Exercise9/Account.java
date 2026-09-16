package truongvietbinh_4831.Lec10_Abstract.Exercise9;

public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract String getAccountType();

    public void display() {
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Balance: " + balance);
    }
}
