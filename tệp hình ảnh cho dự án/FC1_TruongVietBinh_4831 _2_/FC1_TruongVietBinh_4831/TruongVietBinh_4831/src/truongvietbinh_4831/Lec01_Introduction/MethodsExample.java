/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongvietbinh_4831.Lec01_Introduction;

public class MethodsExample {

    public static void message1() {
        System.out.println("This is message1.");
    }

    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message2.");
    }

    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main");
    }
}
