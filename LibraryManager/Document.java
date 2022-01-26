/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManager;

import java.util.Scanner;

/**
 *
 * @author Tran Thanh Son
 */
abstract class Document {
    protected String documentId;
    protected String publisherName;
    protected int issueNumber;
    Scanner input = new Scanner(System.in);
    //Constructor
    Document(){
    }
    //print infomation
    public void printInfo(){
        System.out.format("documentId : %s | pubisherName : %s | issueNumber : %d",
                documentId,publisherName,issueNumber);
    }
    public void inputDocument(){
        System.out.println("Enter DocumentID:");
        documentId = input.nextLine();
        System.out.println("Enter Publisher Name:");
        publisherName = input.nextLine();
        System.out.println("Enter Issue Number:");
        issueNumber = input.nextInt();
    }
    //abstract method
    abstract public String getType();
    abstract public String getId();
    
}
