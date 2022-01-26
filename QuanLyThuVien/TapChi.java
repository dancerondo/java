/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThuVien;

import java.util.Scanner;

/**
 *
 * @author Tran Thanh Son
 */
public class TapChi extends TaiLieu{ 
   private int soPhatHanh;  
   private int thangPhatHanh;  
   public int getSoPhatHanh(){  
    return soPhatHanh;  
   }  
   public void getSoPhatHanh(int soPhatHanh){  
    this.soPhatHanh = soPhatHanh;  
   }  
   public int getThangPhatHanh()  
   {  
    return thangPhatHanh;  
   }  
   public void setThangPhatHanh(int thangPhatHanh){  
    this.thangPhatHanh = thangPhatHanh;  
   }  
   @Override  
   public void inThongTin(){  
    System.out.println(this.getType());  
    super.inThongTin();  
    System.out.println(" |So phat hanh: " + soPhatHanh + " |Thang phat hanh: " + thangPhatHanh);  
   }  
   @Override  
   public void nhapTL(){  
    Scanner scanner = new Scanner(System.in);  
    super.nhapTL();  
    System.out.println("Nhap so phat hanh: ");  
    soPhatHanh = scanner.nextInt();  
    System.out.println("Nhap thang phat hanh: ");  
    thangPhatHanh = scanner.nextInt();  
   }  
   //contructor  
   public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh){  
    this.maTaiLieu = maTaiLieu;  
    this.tenNhaXuatBan = tenNhaXuatBan;  
    this.soBanPhatHanh = soBanPhatHanh;  
    this.soPhatHanh = soPhatHanh;  
    this.thangPhatHanh = thangPhatHanh;  
   }  
   public TapChi(){  
   }  
   @Override  
   public String getType(){  
    return "TapChi";  
   }  
 }  

