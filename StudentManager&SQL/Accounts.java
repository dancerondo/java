
package StudentManager;

import java.util.Scanner;


public class Accounts {
    String code;
    String userName;
    String passWord;
    Scanner input = new Scanner(System.in);
    //Constructor khong co tham so
    public Accounts(){
    }
    //Constructor co tham so
    public Accounts(String code,String userName,String passWord){
        this.code = code;
        this.userName = userName;
        this.passWord = passWord;
    }
    //getter and setter
    //code
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }
    //userName
    public String getUserName(){
        return userName;
    }
    public void setUsername(String userName){
        this.userName = userName;
    }
    //passWord
    public String getPassWord(){
        return passWord;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
    //phuong thuc nhap du lieu
    public void inputAccounts(){
        System.out.println("Enter code : ");
        code = input.nextLine();
        System.out.println("Enter userName : ");
        userName = input.nextLine();
        System.out.println("Enter PassWord : ");
        passWord = input.nextLine();
    }
}
