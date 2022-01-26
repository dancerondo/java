/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManager;

/**
 *
 * @author Tran Thanh Son
 */
public class Newspaper extends Document{
    private int dateOfIssue;
    //Constructor
    Newspaper(){
    }
    Newspaper(String documentId,String publisherName,int issueNumber,int dateOfIssue){
    this.documentId = documentId;
    this.publisherName = publisherName;
    this.issueNumber = issueNumber;
    this.dateOfIssue = dateOfIssue;
    }
    //getter and setter
    public int getDateOfIssue(){
        return dateOfIssue;
    }
    public void setDateOfIssue(int dateOfIssue){
        this.dateOfIssue = dateOfIssue;
    }
    @Override
    public void printInfo(){
        System.out.println("Document Type : " + this.getType());
        super.printInfo();
        System.out.println(" | Date Of Issue:" + dateOfIssue);
    }
    @Override
    public void inputDocument(){
        super.inputDocument();
        System.out.println("Enter Date Of Issue:");
        dateOfIssue = input.nextInt();
    }
    //
    public String getType(){
       return "Newspaper";
    }
    public String getId(){
        return documentId;
    }
}
