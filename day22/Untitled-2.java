import java.sql.*;
//import java.util.*;
public class demo9 {
    public static void main(String[] args) throws Exception {
       // Scanner sc=  new Scanner(System.in);
//            System.out.println("enter id");
//               System.out.println("enter name");
//       int id =sc.nextInt();
//        System.out.println("enter name");
//        String  name=sc.next();
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "root");

        System.out.println("Coonection done");

        Statement stmt;
        stmt=conn.createStatement();
        String sql;
        sql="insert into student values(6,'ij')";
       stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }
}

