/*A HighSchool application has two classes: the Person superclass and the Student subclass. Using 
inheritance, in this lab you will create two new classes, Teacher and CollegeStudent. A Teacher 
will be like Person but will have additional properties such as salary (the amount the teacher 
earns) and subject (e.g. “Computer Science”, “Chemistry”, “English”, “Other”). The 
CollegeStudent class will extend the Student class by adding a year (current level in college) and 
major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).*/



class Person 
{
String n_s, n_t;
 Scanner ob = new Scanner(System.in);
Person()
{ 
System.out.println("Enter name of student : ");
n_s=ob.next();
System.out.println("Enter of student : ");
n_t=ob.next();
}
void getdata()

class  Student extends Person
{
int year;
String m;
System.out.println("Enter student current  year level in college : ");
year=ob.next();
System.out.println("Enter of student : ");
m=ob.next();
}

}
class Teacher extends Person
{
double t_salary ;
String s;
}
class c_student  extends Student 
{
} 

double annual_salary;
int year;
String i_num;
}
class TestEmployee
{
}
