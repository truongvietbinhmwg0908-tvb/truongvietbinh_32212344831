/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truongvietbinh_4831.Lec11_Encapsulation.Exercise18;

import java.util.*;
public class Student {
    private String id;
    private String name;
    private ArrayList<Double> grades;
     public Student()
    {
       grades = new ArrayList<Double>(); 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(ArrayList<Double> grades) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many grades: ");
        int length = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < length; i++) {
            System.out.print("a["+i+"]= ");
            double tam;
            do {
                tam = sc.nextDouble();
                if (tam < 0 || tam > 10) {
                    System.out.print("Wrong value ! Enter again: ");
                }
            } while (tam < 0 || tam > 10);
            grades.add(tam);
        }
    }
    public double getAvrage(ArrayList <Double> a){
        int sum=0, count=0;
        for(int i= 0 ; i<a.size(); i++)
        {
            sum+= a.get(i);
            count++;
        }
        double tam= sum*(1.0)/count;
        return tam;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        String id;
        String name;
        
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        this.setId(id);
        this.setName(name);
        this.addGrade(this.grades);
    }
    public void output()
    {
        System.out.println("ID: "+ this.getId() + " | Name: "+ this.getName()+" | Avarage: "+ this.getAvrage(this.grades));
    }
}

