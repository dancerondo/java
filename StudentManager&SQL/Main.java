
package StudentManager;

import static StudentManager.ConnectDB.getConnection;
import static StudentManager.ManagerStudent.addNewStudent;
import static StudentManager.ManagerStudent.showMenu;
import static StudentManager.ManagerStudent.addScores;
import static StudentManager.ManagerStudent.avgScores;
import static StudentManager.ManagerStudent.displayListStudent;
import static StudentManager.ManagerStudent.displayRanking;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    private static final String DB_URL = ("jdbc:sqlserver://localhost:1433;") +
                                   ("databaseName = StudentDB_TranThanhSon;");
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "123456";    
    //Main
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String user,pass ;
        int keyPress;
        boolean flag = true;
        boolean ok = true;
        //nhap username va pass tu ban phim
        do{
            System.out.println("Enter Your UserName");
            user = input.nextLine();
            System.out.println("Enter Your PassWord");
            pass = input.nextLine();        
            try{
                    //Connect to data StudentDB_TranThanhSon
                    Connection conn = getConnection(DB_URL, USERNAME, PASSWORD); 
                    //Create Statement
                    Statement stmt = conn.createStatement();
                    //get data from Accounts
                    ResultSet rs = stmt.executeQuery("SELECT userName,passwords FROM Accounts ");
                    while ( rs.next()) {
                        if( rs.getString(1).trim().equals(user) && rs.getString(2).trim().equals(pass) ){
                            do{
                                showMenu();
                                keyPress = input.nextInt();
                                
                                switch(keyPress){
                                    case 1:
                                        addNewStudent();
                                        break;
                                    case 2 :
                                        addScores();
                                        break;
                                    case 3 :
                                        displayListStudent();
                                        break;
                                    case 4 :
                                        avgScores();
                                        break;
                                    case 5 :
                                        displayRanking();
                                        break;
                                    default :
                                        System.out.println(" <3 Thank you for using my software <3"); 
                                        ok = false;
                                        break;
                                }
                            }
                            while(ok);
                            flag = false;
                        }
                        else
                            System.out.println("USER OR PASSWORD WRONG!RE ENTER!!!");                       
                    }
                    //Close connection
                    conn.close();
                }
            catch(SQLException ex){
                ex.printStackTrace();
            }       
        }
        while(flag);
    }   
}
