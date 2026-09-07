/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongvietbinh_4831.Lec07_string;

import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string ");
        String s = sc.nextLine();

        System.out.println("original: " + s);
        System.out.println("reversed " + new StringBuilder(s).reverse());
    }
}
