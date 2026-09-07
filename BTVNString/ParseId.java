/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongvietbinh_4831.Lec07_string;

import java.util.*;

public class ParseId {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID, for example SE123456: ");
        String ID = sc.nextLine();
        System.out.println("Major code = " + ID.substring(0, 2));
        System.out.println("Numeric part = " + ID.substring(2, 8));

    }
}
