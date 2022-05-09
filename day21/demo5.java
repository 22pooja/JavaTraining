import java.util.*;
class student
{
int id,p;
String name;
student(int a,String b,int y)
{
  id=a;
  name=b;
  p=y;
  }
public String toString()
{
return "(" +id + "," +name+"," +p+")";
}
public int hashCode()
{
int code;
code =name.hashCode()+id+p;
return code;
}
public boolean equals(Object obj)
{    boolean f=false;
   student st=(student) obj;
   if(id==st.id && name.equals(st.name))
   {
   f=true;
   }
   return f;
   }
   }
  public  class demo5
   {
   public static void main(String []args)
   {
   HashSet<student> hs;
   hs=new HashSet<>();
   student st1=new student(1,"A",2);
student st2=new student(1,"A",2);
hs.add(st1);
hs.add(st2);
System.out.println(hs);
System.out.println(st1.hashCode());
System.out.println(st2.hashCode());
}
}