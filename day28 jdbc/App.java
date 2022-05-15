///DAO
import java.sql.*;
public class Student {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public interface StudInterface {

    void save(Student st);
    void update(Student st);
    void delete(Student st);
    Student getStud(int id);
}
public class StudImpl implements StudInterface {

   
    public void save(Student st) {
       

    }

  
    public void update(Student st) {
     
        String sql = "";
        String name = st.getName();
        int id = st.getId();
        sql = "update student set name='" + name + "' where id=" + id;
        try {
        
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Updated");

            conn.close();
        } catch (Exception e) {
            
        }
    }

 
    public void delete(Student st) {
        

    }

   
    public Student getStud(int id) {
       
        return null;
    }

}




public class App {
    // // public String getGreeting() {
// //         return "Hello World!";
    

    public static void main(String[] args) 
    {
       
        Student st=new Student();
        st.setId(100);
        st.setName("test");

        StudImpl ob;
        ob=new StudImpl();
        ob.update(st);
    }
}


