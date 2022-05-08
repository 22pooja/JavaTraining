/*Write a program to implement a class “student” with the following members. Name of the 
student. Marks of the student obtained in three subjects. Function to assign initial values. 
Function to compute total average. Function to display the student’s name and the total marks. 
Write an appropriate main() function to demonstrate the functioning of the above.*/

class Student1
{
String name;
float m1,m2,m3,avg;

void setData(String s, float x,  float y, float z ){                                                                           
name=s;
m1=x;
m2=y;
m3=z;
}
void getData()
{
System.out.println(name);
System.out.println(m1);
System.out.println(m2);
System.out.println(m3);
}
void getAvg(){
avg=(m1+m2+m3)/3;
System.out.println("avarage of marks is :" +avg);
}
         
}
class Student1class
{
public static void main(String[]args)
{
 Student1 ob1=new Student1();
 Student1 ob2=new  Student1();
 ob1.setData("pjk",10,20,30);
 ob2.setData("xyz",20,30,40);
 ob1.getData();
 ob2.getData();
 ob1.getAvg();
ob2.getAvg();
  
}
} 