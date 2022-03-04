
package StudentManager;
import static StudentManager.ConnectDB.getConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class ManagerStudent {
    
    private static final String DB_URL = ("jdbc:sqlserver://localhost:1433;") +
                                   ("databaseName = StudentDB_TranThanhSon;");
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "123456";
    //showMenu Method
    public static void showMenu(){
        System.out.println("Hi Tran Thanh Son <3!!!");
        System.out.println("=============== Let's Choose this option =============");
        System.out.println("1.Add new Student");
        System.out.println("2.Add Scores for New Students (each Student must enter for 3 subjects).");
        System.out.println("3.Display list of Student");
        System.out.println("4.Calculate AverangeScore And Add to Ranking table");
        System.out.println("5.Display Ranking Student Table");
        System.out.println("6.Press key to exit ");
        System.out.println("**************** Thank you <3 ********************");
    }
    //1.Add New Student Method
    public static void addNewStudent(){
        Student std = new Student();
        std.inputStudent();
        try{
            try (Connection conn = getConnection(DB_URL,USERNAME,PASSWORD)) {
                String SQL = "INSERT INTO Student VALUES(?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(SQL);
                pstmt.setString(1, std.getRollNumber());
                pstmt.setString(2, std.getStudentName());
                pstmt.setString(3, std.getDayOfBirth());
                pstmt.setString(4, std.getPhoneNumBer());
                pstmt.executeUpdate();
                //Close connection
            }
        }
        catch(SQLException ex){
        }
        
    }
    //2.addScore Method
    public static void addScores(){
        Scores score = new Scores();
        score.inputScores();
        try{
            try (Connection conn = getConnection(DB_URL, USERNAME, PASSWORD)) {
                String SQL = "INSERT INTO Scores VALUES(?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(SQL);
                pstmt.setString(1, score.getRollNumber());
                pstmt.setString(2, score.getSubJectCode());
                pstmt.setFloat(3, score.getScore());
                pstmt.executeUpdate();
                //Close connection
            }
        }   
        catch(SQLException ex){
        }        
    }
    //3.displayListStudent Method
    public static void displayListStudent(){
        String SQL = "SELECT * FROM Student";
        try{
            try (Connection conn = getConnection(DB_URL, USERNAME, PASSWORD)) {
                Statement stmt = conn.createStatement();
                ResultSet rs =  stmt.executeQuery(SQL);
                while (rs.next()) {
                    System.out.println(rs.getString(1) + " " + rs.getString(2) + "  " +
                            rs.getString(3) + "  " + rs.getString(4));
                }
                //Close Connection
            }
        }
        catch(SQLException ex){
        }
    }
    //4.AVG Sccore for Student and add to Ranking
    public static void avgScores(){
        String rollNumber;
        String ranking = " ";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rollNumber ");
        rollNumber = input.nextLine();
        
        String SQL = " INSERT INTO Ranking VALUES( ? ,(SELECT AVG(Score) FROM Scores"
                + " WHERE StudentCode = ?) , ? ) ";   
        
        String SQL1 = "UPDATE Ranking SET Ranking = ? WHERE averageScore >= 5";
        String SQL2 = "UPDATE Ranking SET Ranking = ? WHERE averageScore < 5";
        try{
            try (Connection conn = getConnection(DB_URL, USERNAME, PASSWORD)) {
                Statement stmt = conn.createStatement();
                //Insert into Ranking table
                PreparedStatement pstmt = conn.prepareStatement(SQL);
                pstmt.setString(1, rollNumber);
                pstmt.setString(2, rollNumber);
                pstmt.setString(3, ranking);
                pstmt.executeUpdate();
                //update ranking
                //pass
                PreparedStatement pstmt1 = conn.prepareStatement(SQL1);
                pstmt1.setString(1, "pass");
                pstmt1.executeUpdate();
                //fail
                PreparedStatement pstmt2 = conn.prepareStatement(SQL2);
                pstmt2.setString(1, "fail");
                pstmt2.executeUpdate();
                //Close connection
            }
        }
        catch(SQLException ex){
        }
    }
    //5.Display Ranking Table
    public static void displayRanking(){
        String SQL = "SELECT * FROM Ranking";
        try{
            try (Connection conn = getConnection(DB_URL, USERNAME, PASSWORD)) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL);
                while(rs.next()){
                    System.out.println(rs.getString(1) + " " + rs.getFloat(2) + "   "
                            + rs.getString(3));
                }
            }
        }
        catch(SQLException ex){
        }
    }
    
}
