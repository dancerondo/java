/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaleManager;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Person {
    int id;
    int age;
    String name;
    String address;
    Scanner input = new Scanner(System.in);
    //Khoi tao lop Person khong co tham so
    public void Person(){
    }
    //Khoi tao lop Person co tham so
    public void Person(int id,int age,String name,String address){
        this.id = id;
        this.age = age;
        this.address = address;
        this.name = name;
    }
    // Tao get va set
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //get set cho age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    //get set cho name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //get set cho address
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void displayinfo(){
        System.out.format("Id:%d Tuoi:%d Ten:%s Dia chi:%s ",id,age,name,address);
        
    }
    public void inputData(Person ps){
            System.out.println("Nhap id:");
            ps.setId(input.nextInt());
            System.out.println("Nhap tuoi:");
            ps.setAge(input.nextInt());
            input.nextLine();
            System.out.println("Nhap ten:");
            ps.setName(input.nextLine());
            System.out.println("Nhap dia chi");
            ps.setAddress(input.nextLine());        
    } 
}
