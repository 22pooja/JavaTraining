 class Student
{
private int id;
private String name;
 Student(int id,String name)
{
this.id=id;
this.name=name;
}
int getId()
{
return id;
}
String getName()
{ 
return name;
}
}
class Mark extends Student
{
float m1,m2;
Mark(int id,String name,float m1,float m2)
{super (id,name);
this.m1=m1;
this.m2=m2;
}
float getM1()
{
return m1;
}
float getM2()
{
return m2;
}
}
class Result extends Mark
{
Result(int id,String name,float m1,float m2)
{
super (id,name,m1,m2);
}

void show()
{
System .out.println("id"+getId());
System .out.println("name"+getName());
System .out.println("m1 :"+getM1());
System .out.println("m2"+getM2());

}
}

public class DemoMultiLevel
{
public static void main(String[] args)
{
Result ob;
ob=new Result(2,"cbb",45,56);
ob.show();
ob1.show();
}}
