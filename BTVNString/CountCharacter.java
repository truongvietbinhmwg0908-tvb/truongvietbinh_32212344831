package truongvietbinh_4831.Lec07_string;

import java.util.*;

public class CountCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        System.out.println("enter character to count:");
        char target = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Occurrences of" + target + "': " + count);
    }

}
