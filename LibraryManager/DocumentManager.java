/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DocumentManager {
    int n;
    public ArrayList<Document> documentList = new ArrayList<Document>();
    Scanner input = new Scanner(System.in);
    //showMenu Method
    public static void showMenu(){
        System.out.println("***********Menu**********");
        System.out.println("Choose the option:");
        System.out.println("1.Add New Documents(Book,Magazine,Newspaper)");
        System.out.println("2.Delete Document By Code");
        System.out.println("3.Display Infomation About Document");
        System.out.println("4.Seach Document by type(Book,Magazine,Newspaper)");
        System.out.println("5.Exit program!");
        System.out.println("**********Thank you!**********");     
    }
    //Add infomation method
    public void addDocument(){
        do{
            Document dcTemp = null;
            String type;
            System.out.println("********************");
            System.out.println("Add Document Type(Book,Magazine,Newspaper)");
            type = input.nextLine();
            if(type.equals("Book")){
                dcTemp = new Book();
            }
            else if(type.equals("Magazine")){
                dcTemp = new Magazine();                
            }
            else if(type.equals("Newspaper")){
                dcTemp = new Newspaper();
            }
            dcTemp.inputDocument();
            documentList.add(dcTemp);
            System.out.println("Do you want to add more document yes/no(1/0)?");
            //if check = 0 exit loop
            int check = input.nextInt();
            input.nextLine();
            if(check == 0){
                break;
            }
        }
        while(true);
        System.out.println();
    }
    // Delete document by Id
    public void deleteDocument(){
        System.out.println("Enter documentId for delete");
        String id = input.nextLine();
        for(Document dcTemp : documentList){
        if(dcTemp.getId().equals(id)){
            documentList.remove(dcTemp);
            }
        }
    }
    // Display infomation method
    public void showDocument(){
        for(Document  dcTemp : documentList){
            dcTemp.printInfo();
        }   
        System.out.println();
    }
    // Seach Document by Type and Print them
    public void seachDocumentByType(){
        String type;
        System.out.println("Enter type of document for Seach(Book,Magazine,Newspaper)");
        type = input.nextLine();
        if(type.equals("Book")){
            for(Document dcTemp : documentList){
                if(dcTemp.getType() == "Book"){
                    dcTemp.printInfo();
                }
            }
        }
        else if(type.equals("Magazine")){
            for(Document dcTemp : documentList){
                if(dcTemp.getType() == "Magazine"){
                    dcTemp.printInfo();
                }
            }
        }
        else if(type.equals("Newspaper")){
            for(Document dcTemp : documentList){
                if(dcTemp.getType() == "Newspaper"){
                    dcTemp.printInfo();
                }
            }
        }
        System.out.println();
    }
}
