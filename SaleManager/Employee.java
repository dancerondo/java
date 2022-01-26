/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaleManager;

/**
 *
 * @author Admin
 */
public class Employee extends Person{
    int salary;
    //phuong thuc khoi tao khong co tham so
    public void Employee(){
    }
    //phuong thuc khoi tao co tham so
    public void Empoyee(int id,int age,String name,String address,int salary){
        super.Person(id, age, name, address);
        this.salary = salary;
    }
    //tao get va set
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void displayinfo(){
        super.displayinfo();
        System.out.format("Luong :%d\n",salary);
    }
    public void inputData(Employee emp){
        super.inputData(emp);
        System.out.println("Nhap luong:");
        emp.setSalary(input.nextInt());       
    }
    public int sumSalary(Employee emp){
        int sum =0;
        sum += emp.salary;
        return sum;
    }
  
}
