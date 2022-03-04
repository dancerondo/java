
package StudentManager;
import java.util.Scanner;

public class Subjects {
    String subJectCode;
    String subJectName;
    Scanner input = new Scanner(System.in);
    //Constructor khong co tham so
    public Subjects(){
    }
    //Constructor co tham so
    public Subjects(String subJectCode,String subJectName){
        this.subJectCode = subJectCode;
        this.subJectName = subJectName;
    }
    //getter and setter
    //subJectCode
    public String getSubJectCode(){
        return subJectCode;
    }
    public void setSubJectCode(String subJectCode,String subJectName){
        this.subJectCode = subJectCode;        
    }
    //subJectName
    public String getSubJectName(){
        return subJectName;
    }
    public void setSubJectName(String subJectName){
        this.subJectName = subJectName;
    }
    //phuong thuc nhap du lieu
    public void inputSubJects(){
        System.out.println("Enter SubJect Code : ");
        subJectCode = input.nextLine();
        System.out.println("Enter SubJect Name :");
        subJectName = input.nextLine();
    }
            
    
}
