package truongvietbinh_4831.Lec08_ObjectAndClass.Exercise1;

import java.util.Scanner;

public class Student {
   private String studentId;
   private String fullname;
   private String major;
   
   public Student(){
       
   }
   public Student(String studentId, String fullname,String major){
        this.studentId = studentId;
        this.fullname = fullname;
        this.major = major;
   }   
   public void setStudenId(String studentId){ //gan du lieu
       this.studentId = studentId;
   }
   public void setFullname(String fullname){
       this.fullname = fullname;
   }
   public void setMajor(String fullname){
       this.major = major;
   }
   public String getStudentId(){
       return studentId;
   }
   public String getFullname(){
       return fullname;
   }
   public String getMajor(){
       return major;
   }
   public void displayInfo(){
       System.out.println("studen id= " + getStudentId() + ", full name= " + getFullname() + ", major= " + getMajor());
   }
   
   public void enterInfo(){//nhap thong tin tu ban phim
       Scanner scanner = new Scanner(System.in);
       System.out.print(" Enter Student id: ");
       String studentId = scanner.nextLine();
       setStudenId(studentId);
       
       System.out.print("Enter full name: ");
       //setFullname(scanner.nextLine()); cach ngan gon;
       String fullname = scanner.nextLine();
       setFullname(fullname);
       
       System.out.print("Enter major: ");
       setMajor(scanner.nextLine());
   }
}
