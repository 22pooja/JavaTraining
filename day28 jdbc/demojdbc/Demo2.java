package demojdbc;
import java.sql.*;
public class Demo2 {
    

    public static void main(String[] args) throws Exception {

        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "root");

        System.out.println("Coonection done");

            String sql;
        sql="insert into student values(?,?)";
        
        PreparedStatement stmt;
        stmt=conn.prepareStatement(sql);
        stmt.setInt(1, 90);   // 1 is column number 90 is value we hwant to update
        stmt.setString(2, "hhh");  // 2 is column second name "hhh" is value we want to update
        stmt.executeUpdate();

        conn.close();
    }
}


