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
public class Main {
    public static void main(String [] args){
    Scanner input  = new Scanner(System.in);    
    // nhap employee
    Employee [] emp =null;
    Customer [] cus = null;
    int n;
    int m;
    int enterNumber;
    boolean flag = true;
     // nhap du lieu nhan vien
    System.out.println("Nhap so luong nhan vien:");
                n = input.nextInt();
                emp = new Employee[n];
                cus = new Customer[n];
                for(int i = 0;i < n ;i ++){
                    System.out.println("Nhap nhan vien  thu :"+ (i+1));
                    emp[i] = new Employee();
                    emp[i].inputData(emp[i]);
                }
    //nhap du lieu khach hang  
        System.out.println("Nhap so luong khach hang");
                m = input.nextInt();
                for(int i = 0;i < m;i ++){
                    System.out.println("Nhap khach hang thu :" + (i+1));
                    cus[i] = new Customer();
                    cus[i].inputdata(cus[i]);
                } 
    do{
        System.out.println(" === Ban hay chon cac muc sau: === ");
        System.out.println("1.Hien thi thong tin nhan vien va khach hang\n"
                          +"2.Tinh tong luong cua toan bo nhan vien\n"
                          +"3.Tim nhan vien co luong cao nhat\n" 
                          +"4.Hien thi thong tin khach hang mua si\n"
                          +" * Nhap so khac de thoat"
                             );
        enterNumber = input.nextInt();
        
        switch(enterNumber){
            case 1 : //hien thi thong tin khach hang
                System.out.println("THONG TIN KHACH HANG ");
                for(int i = 0;i < m;i++){
                   System.out.println("Khach hang:" + (i+1));
                   cus[i].displayinfo();                 
                }
                 System.out.println();
                //hien thi thong tin nhan vien
                System.out.println("THONG TIN NHAN VIEN ");
                for(int i = 0;i < n;i++){
                    System.out.println("Nhan vien: " +(i+1));
                    emp[i].displayinfo();                  
                }
                System.out.println();
                break;
            case 2 :
                //tong luong nhan vien
                int sum =0;
                for(int i = 0;i < n;i ++){
                     sum += emp[i].sumSalary(emp[i]);
                }
                System.out.println("Tong luong toan bo nhan vien la :"+ sum);
                System.out.println();
                break;
            case 3 :
                // tim va hien thi thong tin nhan vien co luong cao nhat
                int maxSalary = 0;
                for(int i = 0;i < n;i ++){
                    if(maxSalary < emp[i].getSalary()){
                        maxSalary = emp[i].getSalary();
                    }
                }
                for(int i = 0;i < n;i ++){
                    if(emp[i].getSalary() == maxSalary){
                     System.out.println("Thong tin nhan vien co luong cao nhat la:");
                        emp[i].displayinfo();
                    }                
                }
                 System.out.println();
                break;
            
            case 4 :
                // hien thi thong tin khach hang mua si
                for(int i = 0;i < m;i ++){
                    if(cus[i].getTypeCustomer().equals("mua si") ){
                        System.out.println("Thong tin khach hang mua si la :");
                        cus[i].displayinfo();
                    }
                }
                System.out.println();
                break;
            default:
                System.out.println(" === Thank you for using my software ===");
                flag = false;
                break;
        }
    }
    while(flag);
    }
}
