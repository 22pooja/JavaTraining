/*A HighSchool application has two classes: the Person superclass and the Student subclass. Using 
inheritance, in this lab you will create two new classes, Teacher and CollegeStudent. A Teacher 
will be like Person but will have additional properties such as salary (the amount the teacher 
earns) and subject (e.g. “Computer Science”, “Chemistry”, “English”, “Other”). The 
CollegeStudent class will extend the Student class by adding a year (current level in college) and 
major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).*/


import java.util.*;
class Person 
{
String n_s, n_t;
//Scanner ob = new Scanner(System.in);
Person()
{ 
System.out.println("Enter name of student : ");
n_s=ob.next();
System.out.println("Enter name of teacherg : ");
n_t=ob.next();
}
}
class  Student extends Person
{

String clg_name;
int s_age;
Student()
{
System.out.println("Enter clg name of student : ");
 clg_name=ob.next();
System.out.println("Enter  student age : ");
s_age=ob.nextInt();
}

}
class Teacher extends Person
{
double t_salary ;
String s;
Teacher()
{
System.out.println("Enter teacher salary : ");
t_salary=ob.nextDouble();
System.out.println("Enter subject : ");
s=ob.next();

}
void showTeacherData()
{
System.out.println(" Teacher info.......");
System.out.println("Name of teacher  : "+  n_t);
System.out.println("Teaching Subject : "+ s);
System.out.println("Salary : "+ t_salary);
System.out.println("####################");
    }
}
class c_student  extends Student 
{
int year;
String m;
c_student()
{
System.out.println("Enter student current  year level in college : ");
year=ob.nextInt();
System.out.println("Enter of student major : ");
m=ob.next();
}
void showStudentdata()
{
System.out.println("Student info....");
System.out.println(" student Name : "+n_s );
System.out.println("Age of student : "+ s_age);
System.out.println("College Name : "+ clg_name);
System.out.println("Major : "+ m);
System.out.println("Studying year : "+ year);
System.out.println("######################");
}
}
public class Highschool3
{
public static void main(String[] args)
{
c_student c1=new  c_student();
Teacher t1=new  Teacher();
c1.showStudentdata();
t1.showTeacherData();
}
}