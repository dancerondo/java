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
abstract class TaiLieu {  
   protected String maTaiLieu;  
   protected String tenNhaXuatBan;  
   protected int soBanPhatHanh;   
   Scanner scanner = new Scanner(System.in);  
   // contructor  
   public TaiLieu(){  
   }  
   // phuong thuc in ra thong tin cua tai lieu  
   protected void inThongTin(){  
    System.out.format("Ma:%s | Nha Xuat Ban: %s | So ban phat hanh:%d ",maTaiLieu,tenNhaXuatBan,soBanPhatHanh);  
   }  
   //phuong thuc nhap thong tin cho tai lieu  
   public void nhapTL(){  
    System.out.println("Nhap ma tai lieu: ");  
    maTaiLieu = scanner.nextLine();  
    System.out.println("Nhap ten nha xuat ban: ");  
    tenNhaXuatBan = scanner.nextLine();  
    System.out.println("Nhap so ban phat hanh: ");  
    soBanPhatHanh = scanner.nextInt();  
   }  
   // phuong thuc truu tuong de get loai cua tung doi tuong  
   abstract public String getType();  
 }  

