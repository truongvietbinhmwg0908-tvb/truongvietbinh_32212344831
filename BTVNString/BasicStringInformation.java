package truongvietbinh_4831.Lec07_string;

import java.util.*;

public class BasicStringInformation {

    public static String trimText(String text) {
        return text.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line");
        String text = sc.nextLine();
        String trimmed = trimText(text);
        System.out.println("Original:[" + text + "]");
        System.out.println("Trimmed:[" + trimmed + "]");
        System.out.println("upper:[" + text.toUpperCase());
        System.out.println("Lowwer:[" + text.toLowerCase());
        System.out.println("Original length =" + text.length());
        System.out.println("Length after trim =" + trimmed.length());

    }

}
