package truongvietbinh_4831.Lec11_Encapsulation.Exercise15;
import java.util.Scanner;
public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.addInfo();
        double amount1, amount2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Deposit: ");
        amount1 = sc.nextDouble();
        account.deposit(amount1);
        System.out.println("Withdraw: ");
        amount2 = sc.nextDouble();
        boolean result = account.withdraw(amount2);
        if (result == true) {
            System.out.println("Completely withdraw");
        } else {
            System.out.println("Failed");
        }
        account.displayInfo();

    }
}

