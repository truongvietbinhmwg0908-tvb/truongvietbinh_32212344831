

package truongvietbinh_4831.Lec08_ObjectAndClass.Exercise2;

import java.util.Scanner;


public class Rectangular {
    private double length;
    private double width;
    
    public Rectangular(){
        
    }
    public Rectangular(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    
    public void EnterInfo(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter length: ");
        setLength(scanner.nextDouble());
        
        System.out.println("Enter width: ");
        setWidth(scanner.nextDouble());
    }
    public double getArea(){
        return (getLength() * getWidth());
    }
    public double getPerimeter(){          
        return (getLength() + getWidth()) * 2;
    }
    public void DisplayInfo(){
        System.out.println("Area= " + getArea() + " , perimeter= " + getPerimeter() );
    }
}
