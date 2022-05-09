interface A
{ 
void add(int x,int y);
}
class test implements A        // test is concreat class
{
public void add(int x,int y)
{
System.out.println(x+y);
}
}
class demoFunInterface
{
public static void main(String []args)
{
test t1=new test();
t1.add(10,20);
A ob1=new A()       // anonomus class 
{ 
public void add(int x,int y)
{
System.out.println(x+y);
}
};
ob1.add(100,200);
}
}
