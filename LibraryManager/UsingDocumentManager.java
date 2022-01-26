/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManager;

import static LibraryManager.DocumentManager.showMenu;
import java.util.Scanner;

/**
 *
 * @author Tran Thanh Son
 */
public class UsingDocumentManager {
    public static void main(String [] args){
        DocumentManager dcManager = new DocumentManager();
        Scanner input = new Scanner(System.in);
        int choose;
        boolean flag = false;
        while(true){
            showMenu();
            choose = input.nextInt();
            switch(choose){
                case 1:
                        //add document
                        dcManager.addDocument();
                        break;
                case 2:
                        //delete document
                        dcManager.deleteDocument();
                        break;
                case 3:
                        // display document infomation
                        dcManager.showDocument();
                case 4:
                        //seach document by type
                        dcManager.seachDocumentByType();
                        break;
                case 5:
                        //exit program
                        System.out.println("Exit program");
                        flag  = true;
                        break;
                default :
                        System.out.println("Chose wrong option,you must choose number on the Menu");
                       break;
            }
            if(flag == true){
                break;
            }
        }
    }
}
