class A
{
void show()
{ System.out.println("In A");
}
}
class B extends A
{
void disp()
{ System.out.println("In B");
}
}
public class DemoInheritance
{
 public static void main(String[] args)
 {
 B ob=new B();
 ob.show();
 }}