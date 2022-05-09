/* 6.  Write a Program to take care of Number Format Exception if user enters values other than integer for 
calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken 
from the user while executing the program. In the same Program write your own Exception classes to 
take care of Negative values and values out of range (i.e. other than in the range of 0-100)
Exception Handling: Throw & Used Defined Exception*/


/*class MyException extends Exception {
    
    public String toString() {
        return "Enter non negative value of Id";
    }
}*/

class Mark {

    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) throws MyException {
        
            if(id<0){
                MyException ob;
                ob=new MyException();
                throw ob;
            }
      
   /*     this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Demo6 {
    public static void main(String[] args) {
        try {
            Student st = new Student();
        st.setId(100);
        st.setName("abc");
        System.out.println(st.getId());
        System.out.println(st.getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}*/

