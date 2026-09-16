/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truongvietbinh_4831.Lec10_Abstract.Exercise3;

/**
 *
 * @author Admin
 */
public class Report implements Printable{
    private String title;

    public Report(String t) {
        this.title = t;
    }

    @Override
    public void print() {
        System.out.println("Report Title: " + title);
    }
}

