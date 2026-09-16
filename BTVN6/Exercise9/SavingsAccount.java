package truongvietbinh_4831.Lec10_Abstract.Exercise9;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}
