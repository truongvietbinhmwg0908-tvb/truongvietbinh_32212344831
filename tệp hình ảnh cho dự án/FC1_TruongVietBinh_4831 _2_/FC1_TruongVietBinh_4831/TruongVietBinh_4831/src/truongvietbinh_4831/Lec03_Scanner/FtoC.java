
package truongvietbinh_4831.Lec03_Scanner;

import java.util.Scanner;


public class FtoC {
    public static double CtoF(double Celsiuc){
    double Fahrenheit = (Celsiuc * 9)/5 + 32;
    return Fahrenheit;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Celsiuc: ");
        double Celsiuc = scanner.nextDouble();
        
        double Fahrenheit = CtoF(Celsiuc);
        System.out.println("Fahrenheit: " + Fahrenheit);
    }
}
