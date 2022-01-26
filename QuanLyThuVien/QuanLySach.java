/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThuVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tran Thanh Son
 */
public class QuanLySach{
   TaiLieu[] taiLieu;  
   int n;  
   public ArrayList<TaiLieu> listTaiLieu = new ArrayList<TaiLieu>();  
   public static Scanner scanner = new Scanner(System.in);  
   // phuong thuc tinh hien menu  
   public static void showMenu(){  
    System.out.println("--------------------Menu---------------------"); 
    System.out.println("Lua chon chuc nang: ");
    System.out.println("1. Nhap thong tin ve cac tai lieu.");  
    System.out.println("2. Hien thi thong tin ve cac tai lieu.");  
    System.out.println("3. Tim kiem tai lieu theo loai."); // cai nay dung lenh instand of de kiem tra  
    System.out.println("4. Thoat khoi chuong trinh.");  
    System.out.println("***********************************************");
      
   }  
   // phuong thuc nhap thong tin ve cac loai tai lieu, khi dung mang 1 chieu  
   public void nhapTL()  
   {  
    System.out.print("Nhap so tai lieu can nhap: ");  
    n = scanner.nextInt();  
    taiLieu = new TaiLieu[n];  
    scanner.nextLine(); // doc lay bo dem khi nhan enter  
    for (int i = 0; i < n; i++)   
    {  
      System.out.println("**************************************");  
      System.out.print("Nhap loai tai lieu (sach, bao, tap chi): ");  
      String type = scanner.nextLine();  
      if (type.equals("sach"))   
      {  
       taiLieu[i] = new Sach();  
      }   
      else if (type.equals("bao"))   
      {  
       taiLieu[i] = new Bao();  
      }  
      else if (type.equals("tap chi"))   
      {  
       taiLieu[i] = new TapChi();  
      }  
      else  
      {  
       --i;  
       continue;  
      }  
      taiLieu[i].nhapTL();
    }  
   }  
   // phuong thuc nhap thong tin ve cac loai tai lieu, danh cho dung kieu list  
   public void nhapTLlist(){  
    do   
    {  
      TaiLieu tlTemp = null;  
      System.out.println("**************************************");  
      System.out.println("Nhap loai tai lieu (sach, bao, tap chi): ");  
      String type = scanner.nextLine();  
      if (type.equals("sach"))   
      {  
       tlTemp = new Sach();  
      }   
      else if (type.equals("bao"))   
      {  
       tlTemp = new Bao();  
      }  
      else if (type.equals("tap chi"))   
      {  
       tlTemp = new TapChi();  
      }  
      tlTemp.nhapTL();  
      listTaiLieu.add(tlTemp);  
      System.out.println("Ban co muon nhap tiep cac tai lieu 1/0(yes/no)? ");  
      int check = scanner.nextInt();  
      scanner.nextLine(); // doc lay bo dem khi nhan enter  
      // ham kiem tra neu check ==0 thi break, thoat khoi vong lap do while  
      if (check == 0)   
      {  
       break;  
      }  
    }  
    while(true);  
   }  
   // phuong thuc hien thi thong tin ve cac tai lieu  
   public void showTaiLieu()  
   {  
    for (int i = 0; i < taiLieu.length; i++)   
    {  
      taiLieu[i].inThongTin();  
    }  
   }  
   // phuong thuc hien thi thong tin ve cac tai lieu  
   public void showTaiLieuList()  
   {  
    for (TaiLieu tlTemp : listTaiLieu)   
    {  
      tlTemp.inThongTin();  
    }  
   }  
   //phuong thuc tim kiem tai lieu theo loai va in ra tat ca tai lieu loai do  
   public void searchTLieuByType(){  
      System.out.println("Nhap loai tai lieu (sach, bao, tap chi): ");  
      String type = scanner.nextLine();  
      if(type.equals("sach")){  
       for(TaiLieu tlTemp : listTaiLieu)   
       {  
         if(tlTemp.getType() == "Sach")   
         {  
          tlTemp.inThongTin();  
         }  
       }  
      }   
      else if (type.equals("bao"))   
      {  
       for (TaiLieu tlTemp : listTaiLieu)   
       {  
         if (tlTemp.getType() == "Bao")   
         {  
          tlTemp.inThongTin();  
         }  
       }  
      }  
      else if (type.equals("tap chi"))   
      {  
       for (TaiLieu tlTemp : listTaiLieu)   
       {  
         if (tlTemp.getType() == "TapChi")   
         {  
          tlTemp.inThongTin();  
         }  
       }  
      }  
   }  
   // Neu muon lay du lieu tu cac lop con thi dung cach nay  
   public void outputTenTacGia() {  
     for (int i = 0; i < n; i++) {  
       if (taiLieu[i] instanceof Sach)  
         System.out.println("Tac gia cuon sach thu " + (i + 1)  
             + " la : " + ((Sach) taiLieu[i]).getTenTacGia());  
     }  
   }  
 
}
