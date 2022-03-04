
package StudentManager;

import java.util.Scanner;

public class Student {
    String rollNumber;
    String studentName;
    String dayOfBirth;
    String phoneNumber;
    Scanner input = new Scanner(System.in);
    //contructor khong co tham so
    public Student(){
    }
    //constructor cos tham so
    public Student(String rollNumber,String studentName,String dayOfBirth,
                   String phoneNumber){
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.dayOfBirth = dayOfBirth;
        this.phoneNumber = phoneNumber;
    }
    //getter and setter
    
    //rollNumber
    public String getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }
    //studentName
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    //dayOfBirth
    public String getDayOfBirth(){
        return dayOfBirth;
    }
    public void setDayOfBirth(String dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }
    //phoneNumber
    public String getPhoneNumBer(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    //phuoc thuc nhap du lieu
    public void inputStudent(){
        System.out.println("Enter RollNumber : ");
        rollNumber = input.nextLine();
        System.out.println("Enter Student Name : ");
        studentName = input.nextLine();
        System.out.println("Enter day of birth : (yyyy-mm-ddd)");
        dayOfBirth = input.nextLine();
        System.out.println("Enter phone number : ");
        phoneNumber = input.nextLine();
        
    }
}
