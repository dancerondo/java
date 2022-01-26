/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThuVien;

import static QuanLyThuVien.QuanLySach.scanner;
import static QuanLyThuVien.QuanLySach.showMenu;

/**
 *
 * @author Admin
 */
public class Main{
    public static void main(String[] args){  
    QuanLySach qls = new QuanLySach();  
    int choose;// bien lua chon  
    boolean exit = false;  
    while(true){       
      showMenu();  
      choose = scanner.nextInt();  
      scanner.nextLine(); // doc lay bo dem khi nhan enter  
      switch(choose){  
       case 1:  
        // qls.nhapTL();  
         qls.nhapTLlist();
         break;  
       case 2:  
       //  qls.showTaiLieu();  
         qls.showTaiLieuList();
         break;  
       case 3:  
         qls.searchTLieuByType();  
         break;  
       case 4:  
         System.out.println("Thoat khoi chuong trinh !");  
         exit = true;  
         break;  
       default:  
         System.out.println("Nhap sai chuc nang, lua chon chuc nang da hien trong memu!");  
         break;  
      }  
      if (exit == true){  
       break;  
      }  
    }  
   }  
}
