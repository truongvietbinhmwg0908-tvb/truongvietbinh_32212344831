/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongvietbinh_4831.Lec07_string;

import java.util.*;

public class CheckPrefix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String F = scanner.nextLine();
        System.out.println(F.startsWith("report"));
        System.out.println(F.endsWith(".pdf"));
        System.out.println("First charater = " + F.charAt(0));
        System.out.println("Last character =" + F.charAt(F.length() - 1));
    }
    
}
