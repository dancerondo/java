
package StudentManager;
import java.util.Scanner;

public class Scores {
    String rollNumber;
    String subJectCode;
    float score;
    Scanner input = new Scanner(System.in);
    //Constructor khong co tham so
    public Scores(){    
    }
    //Constructor co tham so
    public Scores(String rollNumber,String subJectCode,float Score){
        this.rollNumber = rollNumber;
        this.subJectCode = subJectCode;
        this.score = score;
    }
    //getter and setter
    //rollNumber
    public String getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }
    //StudentCode
    public String getSubJectCode(){
        return subJectCode;
    }
    public void setSubJectCode(String subJectCode){
        this.subJectCode = this.subJectCode;
    }
    //Score
    public float getScore(){
        return score;
    }
    public void setScore(float score){
        this.score = score;
    }
    //phuong thuc nhap du lieu
    public void inputScores(){
        System.out.println("Enter rollNumber : ");
        rollNumber = input.nextLine();
        System.out.println("Enter Subject Code : (sj01,sj02,sj03)");
        subJectCode = input.nextLine();
        System.out.println("Enter score : ");
        score = input.nextFloat();
    }
}
