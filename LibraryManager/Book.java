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
public class Book extends Document{
    private String authorName;
    private int pageNumber;
    //Constructor
    public void Book(){
    }
    public void Book(String documentId,String publisherName,int issueNumber,
                     String authorname,int pageNumber){
        this.documentId = documentId;
        this.publisherName = publisherName;
        this.issueNumber = issueNumber;
        this.authorName = authorname;
        this.pageNumber = pageNumber;
    }
    //getter and setter
    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public int getPageNumber(){
        return pageNumber;
    }
    public void setPageNumber(int pageNumber){
        this.pageNumber = pageNumber;
    }
    @Override
    public void printInfo(){
        System.out.println("Document type : " + this.getType());
        super.printInfo();
        System.out.format("| Author Name:%s | Page Number:%d",authorName,pageNumber);
        System.out.println();
    } 
    @Override
    public void inputDocument(){
        Scanner input = new Scanner(System.in);
        super.inputDocument();
        System.out.println("Author Name:");
        authorName = input.nextLine();
        System.out.println("Page Number: ");
        pageNumber = input.nextInt();
    }
    @Override
    public String getType(){
        return "Book";
    }
    @Override
    public String getId(){
    return documentId;
    }
}
