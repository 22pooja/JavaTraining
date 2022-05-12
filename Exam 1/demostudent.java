class student
{
String first_name;
String last_name;
int year;
String major;
student(){
public String  setFirst_name(String first_name)
{
this.first_name=first_name;
}
 public String  setLast_name(String last_name)
 {
this.last_name=last_name;
}
public String  getFirst_name()
{
return first_name;
}
 public String  getLast_name()
 {
return Last_name;
}
public int  setYear(int year)
 {
this.year=year;
}
public int getYear()
{
return year;
}

}
public class demostudent
{
public static void main(String []args)
{
student t1=new student();
t1.setFirst_name("asd");
t1.getFirst_name();
t1.setLast_name("poi");
t1.getLast_name();


t1.setYear(12);
t1.getYear();
// t1. setExperience(20);
// t1. getExperience();
}
}


