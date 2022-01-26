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
public class Sach extends TaiLieu{
    private String tenTacGia;  
   private int soTrang;  
   public String getTenTacGia(){  
    return tenTacGia;  
   }  
   public void setTenTacGia(String tenTacGia){  
    this.tenTacGia = tenTacGia;  
   }  
   public int getSoTrang(){  
    return soTrang;  
   }  
   public void setSoTrang(int soTrang){  
    this.soTrang = soTrang;  
   }  
   @Override  
   public void inThongTin(){  
    System.out.println(this.getType());  
    super.inThongTin();  
    System.out.println(" |Tac Gia: " + tenTacGia + " |So trang: " + soTrang);  
   }  
   @Override  
   public void nhapTL(){  
    Scanner scanner = new Scanner(System.in);  
    super.nhapTL();  
    System.out.println("Nhap ten tac gia cuon sach: ");  
    tenTacGia = scanner.nextLine();  
    System.out.println("Nhap so trang cua cuon sach: ");  
    soTrang = scanner.nextInt();  
   }  
   //contructor  
   public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang){  
    this.maTaiLieu = maTaiLieu;  
    this.tenNhaXuatBan = tenNhaXuatBan;  
    this.soBanPhatHanh = soBanPhatHanh;  
    this.tenTacGia = tenTacGia;  
    this.soTrang = soTrang;  
   }  
   public Sach(){  
   }  
   @Override  
   public String getType() {  
    return "Sach";  
   }  
 }  

