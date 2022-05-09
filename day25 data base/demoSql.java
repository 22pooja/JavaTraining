import java.sql.*;
import java.util.Scanner;

public class demoSql {

    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        //System.out.println("Driver loaded");
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter username : ");
        String id = ob.next();
        System.out.println("Enter password : ");
        String name = ob.next();
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo",  "postgres", "root");
        System.out.println("Connection Done!");
        Statement stmt = conn.createStatement();
        System.out.println("Enter query : ");
        String sql = ob.nextLine();
        stmt.executeUpdate(sql);
        System.out.println("Record Inserted");
        conn.close();
    }
}