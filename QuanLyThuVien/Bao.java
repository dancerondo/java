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
public class Bao extends TaiLieu{
     private int ngayPhatHanh;  
   public int getNgayPhatHanh(){  
    return ngayPhatHanh;  
   }  
   public void setNgayPhatHanh(int ngayPhatHanh){  
    this.ngayPhatHanh = ngayPhatHanh;  
   }  
   @Override  
   public void inThongTin(){  
    System.out.println(this.getType());  
    super.inThongTin();  
    System.out.println(" |Ngay phat hanh: " + ngayPhatHanh);  
   }  
   @Override  
   public void nhapTL(){  
    Scanner scanner = new Scanner(System.in);  
    super.nhapTL();  
    System.out.println("Nhap ngay phat hanh cua bao: ");  
    ngayPhatHanh = scanner.nextInt();  
   }  
   //contructor  
   public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh)  
   {  
    this.maTaiLieu = maTaiLieu;  
    this.tenNhaXuatBan = tenNhaXuatBan;  
    this.soBanPhatHanh = soBanPhatHanh;  
    this.ngayPhatHanh = ngayPhatHanh;  
   }  
   public Bao(){  
   }  
   @Override  
   public String getType() {  
    return "Bao";  
   }  
}
