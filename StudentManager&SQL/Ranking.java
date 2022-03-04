
package StudentManager;
import java.util.Scanner;

public class Ranking {
    String rollNumber;
    float averangeScore;
    String ranking;
    Scanner input = new Scanner(System.in);
    //Constructor khong co tham so
    public Ranking(){  
    }
    //Constructor co tham so
    public Ranking(String rollNumber,float averangeScore,String ranking){
        this.rollNumber = rollNumber;
        this.averangeScore = averangeScore;
        this.ranking = ranking;
    }
    //getter and setter
    // rollNumber
    public String getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }
    //averangerScore
    public float getAverangeScore(){
        return averangeScore;
    }
    public void setAverangeScore(float averangeScore){
        this.averangeScore = averangeScore;
    }
    //Ranking
    public String getRanking(){
        return ranking;
    }
    public void setRanking(String ranking){
        this.ranking = ranking;
    }
    //phhuong thuc nhap du lieu
    public void inputRanking(){
        System.out.println("Enter rollNumber : ");
        rollNumber = input.nextLine();
        System.out.println("Enter AverangeScore : ");
        averangeScore = input.nextFloat();
        System.out.println("Enter Ranking : ");
        ranking = input.nextLine();
    }
}
