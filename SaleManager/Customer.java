/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaleManager;

/**
 *
 * @author Admin
 */
public class Customer extends Person{
    String type_customer;
    // phuong thuc khoi tao khong co tham so
    public void Customer(){
    }
    // phuong thuc khoi tao co tham so
    public void Customer(int id,int age,String name,String address,String type_customer){
        super.Person(id, age, name, address);
        this.type_customer = type_customer;          
    }
    //tao get va set
    public String getTypeCustomer(){
        return type_customer;
    }
    public void setTypeCustomer(String type_customer){
        this.type_customer = type_customer;
    }
    public void displayinfo(){
        super.displayinfo();
        System.out.format("Loai khach hang :%s\n",type_customer);
    }
    public void inputdata(Customer cus){
        super.inputData(cus);
        System.out.println("Nhap loai khach hang:");
        cus.setTypeCustomer(input.nextLine());        
    }
    
}
