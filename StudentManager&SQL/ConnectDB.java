
package StudentManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    
    public static Connection getConnection(String dbURL,String userName,String passWord){
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL,userName,passWord);
            System.out.println("Connect successfully!");
        }
        catch(Exception ex){
            System.out.println("Connection fail!");
            ex.printStackTrace();
        }
        return(conn);
    }
    
}
