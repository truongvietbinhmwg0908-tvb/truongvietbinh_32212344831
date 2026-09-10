
package truongvietbinh_4831.Lec08_ObjectAndClass.Exercise1;

public class Studendemo {
    public static void main(String[] args) {
        Student student1 = new Student("abc1","nguyen van a","It");
        Student student2 = new Student("abc2","nguyen van b","HB");
        student1.displayInfo();
        student2.displayInfo();
        
        Student student3 = new Student();
        student3.enterInfo();
        student3.displayInfo();
        
        Student student4 = new Student();
        student4.enterInfo();
        student4.displayInfo();
    }
}
