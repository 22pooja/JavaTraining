import java.sql.*;
import java.util.*;
public class Assign1 {
    public static void main(String[] args) throws Exception {
       
        Scanner sc=new Scanner(System.in);
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "root");
        System.out.println("Coonection done");
        Statement stmt;
        stmt=conn.createStatement();

        System.out.println("Enter 1 For insert 2 for Select 3 for update 4 for Delete 5 for Exit");
        int choice;
        System.out.println("Enter Your Choice");
        choice=sc.nextInt();
        System.out.println("Enter Id"); 
        int id=sc.nextInt();  
        System.out.println("Enter Name"); 
        String name=sc.next();
        String sql;
        if(choice==1){
                 sql="insert into student values("+id+",'"+name+"')";
                 stmt.executeUpdate(sql);
                 
                        System.out.println("record inserted");
        }
        else if(choice==2)
        {int n=sc.nextInt();  
                 sql="delete from student where id="+n+"";
                 stmt.executeUpdate(sql);
                 
                        System.out.println("record deleted");
        }
        else if(choice==3)
        {int n1=sc.nextInt();  
                 sql="update student set id="+n1+" where name='java'";
                 stmt.executeUpdate(sql);
                 
                        System.out.println("record updated");
        }
        else if(choice==4)
        {
                 //sql="select id,name from student where id="+n3+";
                 sql="select  * from student";
                 stmt.executeUpdate(sql);
                 
                        System.out.println("record selected");
          }
          else
          {
                 System.out.println("Number is not found ");
          }
            
                        System.out.println("record inserted");

        conn.close();

    }
}