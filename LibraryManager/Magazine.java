/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManager;

/**
 *
 * @author Tran Thanh Son
 */
public class Magazine extends Document{
    private int issueNumbers;
    private int issueMonth;
    //Constructor
    public void Magazine(){
    }
    public void Magazine(String documentId,String publisherName,int issueNumber,
                         int issueNumbers,int issueMonth){
        this.documentId = documentId;
        this.publisherName = publisherName;
        this.issueNumber = issueNumber;
        this.issueNumbers = issueNumbers;
        this.issueMonth = issueMonth;
    }
    //getter and setter
    public int getIssueNumbers(){
        return issueNumbers;
    }
    public void setIssueNumbers(int issueNumbers){
        this.issueNumbers = issueNumbers;
    }
    public int getIssueMonth(){
        return issueMonth;
    }
    public void setIssueMonth(int issueMonth){
        this.issueMonth = issueMonth;
    }
    @Override
    public void printInfo(){
        System.out.println("Document Type : " + this.getType());
        super.printInfo();
        System.out.format(" | Issue Numbers: %d | Issue Month: %d",issueNumber,issueMonth); 
        System.out.println();
    }
    @Override
    public void inputDocument(){
        super.inputDocument();
        System.out.println("Enter Issue Numbers:");
        issueNumbers = input.nextInt();
        System.out.println("Enter Issue Month:");
        issueMonth = input.nextInt();
    }
    @Override
    public String getType(){
        return "Magazine";
    }
    @Override
    public String getId(){
    return documentId;
    }
}
